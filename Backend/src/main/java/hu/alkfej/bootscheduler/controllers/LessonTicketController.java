package hu.alkfej.bootscheduler.controllers;

import hu.alkfej.bootscheduler.entities.LessonTicket;
import hu.alkfej.bootscheduler.repositories.LessonTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("lesson_ticket")
public class LessonTicketController {
    
    @Autowired
    private LessonTicketRepository lessonTicketRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<LessonTicket>> getAll(){
        return new ResponseEntity(lessonTicketRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LessonTicket> get(@PathVariable Long id){
        Optional<LessonTicket> lessonTicket = lessonTicketRepository.findById(id);
        if (!lessonTicket.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(lessonTicket.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<LessonTicket> update(@PathVariable Long id, @RequestBody LessonTicket lessonTicket) {
        Optional<LessonTicket> oLessonTicket = lessonTicketRepository.findById(id);
        if (oLessonTicket.isPresent()) {
            lessonTicket.setId(id);
            return ResponseEntity.ok(lessonTicketRepository.save(lessonTicket));
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("")
    public ResponseEntity<LessonTicket> post(@RequestBody LessonTicket lessonTicket) {
        return ResponseEntity.ok(lessonTicketRepository.save(lessonTicket));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<LessonTicket> delete(@PathVariable Long id) {
        Optional<LessonTicket> lessonTicket = lessonTicketRepository.findById(id);
        if (!lessonTicket.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        lessonTicketRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
