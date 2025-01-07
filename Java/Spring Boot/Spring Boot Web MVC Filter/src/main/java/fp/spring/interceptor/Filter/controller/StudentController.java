package fp.spring.interceptor.Filter.controller;


import fp.spring.interceptor.Filter.model.Student;
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
