package fp.string.ExceptionHandling.controller;

import fp.string.ExceptionHandling.exceptions.InvalidIdException;
import fp.string.ExceptionHandling.exceptions.ServiceDownTimeException;
import fp.string.ExceptionHandling.model.Student;
import fp.string.ExceptionHandling.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/panel")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/dashboard")
    public String dashboard( @RequestParam(name = "id", required = false) Long id , Model model ) throws InvalidIdException, ServiceDownTimeException {
        Student student =  studentService.findStudentById(id);
        model.addAttribute("student",student);
        return "dashboard";
    }


}
