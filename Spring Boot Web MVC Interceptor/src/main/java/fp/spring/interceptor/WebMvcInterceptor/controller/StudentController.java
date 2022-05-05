package fp.spring.interceptor.WebMvcInterceptor.controller;


import fp.spring.interceptor.WebMvcInterceptor.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent( @PathVariable Long id ){
        return ResponseEntity.ok(new Student(1L,"John"));
    }

}
