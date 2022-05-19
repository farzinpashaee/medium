package fp.string.ExceptionHandling.controller;

import fp.string.ExceptionHandling.exceptions.InvalidIdException;
import fp.string.ExceptionHandling.exceptions.ServiceDownTimeException;
import fp.string.ExceptionHandling.model.Student;
import fp.string.ExceptionHandling.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1/")
public class StudentRestController {

    @Autowired
    StudentService studentService;

    @GetMapping("student/{id}")
    public ResponseEntity<Student> getUser(@PathVariable(name = "id", required = false) Long id  ) throws InvalidIdException, ServiceDownTimeException {
        Student student =  studentService.findStudentById(null);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(student);
    }


}
