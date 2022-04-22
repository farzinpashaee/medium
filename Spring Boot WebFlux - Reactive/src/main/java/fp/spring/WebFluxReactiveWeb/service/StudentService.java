package fp.spring.WebFluxReactiveWeb.service;

import fp.spring.WebFluxReactiveWeb.model.Student;
import fp.spring.WebFluxReactiveWeb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Mono<Student> getStudentById(Long id ){
        return studentRepository.findById(id);
    }

    public Flux<Student> getStudentList(){
        return studentRepository.findAll();
    }

}
