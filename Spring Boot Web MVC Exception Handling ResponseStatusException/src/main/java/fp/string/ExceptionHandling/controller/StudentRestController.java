package fp.string.ExceptionHandling.controller;

import fp.string.ExceptionHandling.exceptions.InvalidIdException;
import fp.string.ExceptionHandling.exceptions.ServiceDownTimeException;
import fp.string.ExceptionHandling.model.Student;
import fp.string.ExceptionHandling.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1/")
public class StudentRestController {

    @Autowired
    StudentService studentService;

    @GetMapping("student/{id}")
    public ResponseEntity<Student> getUser(@PathVariable(name = "id", required = false) Long id  )  {
        Student student;
        try {
            student = studentService.findStudentById(null);
        } catch (InvalidIdException e) {
            e.printStackTrace();
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, e.getMessage(), e);
        } catch (ServiceDownTimeException e) {
            e.printStackTrace();
            throw new ResponseStatusException(
                    HttpStatus.SERVICE_UNAVAILABLE, e.getMessage(), e);
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(student);
    }


}
