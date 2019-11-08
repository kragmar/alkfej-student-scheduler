package hu.alkfej.bootscheduler.controllers;

import hu.alkfej.bootscheduler.entities.Lesson;
import hu.alkfej.bootscheduler.repositories.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("lesson")
public class LessonController {

    @Autowired
    private LessonRepository lessonRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Lesson>> getAll(){
        return new ResponseEntity(lessonRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lesson> get(@PathVariable Long id){
        Optional<Lesson> lesson = lessonRepository.findById(id);
        if (!lesson.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(lesson.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lesson> update(@PathVariable Long id, @RequestBody Lesson lesson) {
        Optional<Lesson> oLesson = lessonRepository.findById(id);
        if (oLesson.isPresent()) {
            lesson.setId(id);
            return ResponseEntity.ok(lessonRepository.save(lesson));
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("")
    public ResponseEntity<Lesson> post(@RequestBody Lesson lesson) {
        return ResponseEntity.ok(lessonRepository.save(lesson));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Lesson> delete(@PathVariable Long id) {
        Optional<Lesson> lesson = lessonRepository.findById(id);
        if (!lesson.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        lessonRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
