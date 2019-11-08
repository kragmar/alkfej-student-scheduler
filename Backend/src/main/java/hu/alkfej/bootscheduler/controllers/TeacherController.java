package hu.alkfej.bootscheduler.controllers;

import hu.alkfej.bootscheduler.entities.Teacher;
import hu.alkfej.bootscheduler.repositories.TeacherRepository;
import hu.alkfej.bootscheduler.security.AuthenticatedUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private AuthenticatedUser authenticatedUser;

    @GetMapping("")
    public ResponseEntity<Iterable<Teacher>> getAll(){
        return new ResponseEntity(teacherRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> get(@PathVariable Long id){
        Optional<Teacher> teacher = teacherRepository.findById(id);
        if (!teacher.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(teacher.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Teacher> update(@PathVariable Long id, @RequestBody Teacher teacher) {
        Optional<Teacher> oTeacher = teacherRepository.findById(id);
        if (oTeacher.isPresent()) {
            teacher.setId(id);
            return ResponseEntity.ok(teacherRepository.save(teacher));
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("")
    public ResponseEntity<Teacher> post(@RequestBody Teacher teacher) {
        return ResponseEntity.ok(teacherRepository.save(teacher));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Teacher> delete(@PathVariable Long id) {
        Optional<Teacher> teacher = teacherRepository.findById(id);
        if (!teacher.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        teacherRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("logoff")
    public ResponseEntity logoff() {
        authenticatedUser.setTeacher(null);
        return ResponseEntity.ok(0);
    }
}
