package fp.spring.WebFluxReactiveWeb.controller;

import fp.spring.WebFluxReactiveWeb.model.Student;
import fp.spring.WebFluxReactiveWeb.repository.StudentRepository;
import fp.spring.WebFluxReactiveWeb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/{id}")
    public Mono<Student> getStudentById(@PathVariable Long id ){
        return studentService.getStudentById(id);
    }

    @GetMapping("/list")
    public Flux<Student> getStudentList(){
        return studentService.getStudentList();
    }


}
