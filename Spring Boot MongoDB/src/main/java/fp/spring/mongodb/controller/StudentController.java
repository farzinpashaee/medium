package fp.spring.mongodb.controller;


import fp.spring.mongodb.model.Student;
import fp.spring.mongodb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable String id ){
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(!studentOptional.isPresent())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(studentOptional.get());
    }

    @GetMapping("name/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable String name ){
        Optional<Student> studentOptional = studentRepository.findItemByName(name);
        if(!studentOptional.isPresent())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(studentOptional.get());
    }

    @PostMapping("/add")
    public ResponseEntity<?> getStudent( @RequestBody Student student ){
        studentRepository.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
