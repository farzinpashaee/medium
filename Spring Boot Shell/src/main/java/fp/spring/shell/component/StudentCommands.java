package fp.spring.shell.component;

import fp.spring.shell.model.Student;
import fp.spring.shell.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.Optional;

@ShellComponent
public class StudentCommands {

    @Autowired
    StudentService studentService;

    @ShellMethod("Add two integers together")
    public String find(@ShellOption(value = "-id") Long id){
        Optional<Student> studentOptional =  studentService.getStudentById(id);
        if(((Optional) studentOptional).isPresent())
            return studentOptional.get().toString();
        return "Not Found!";
    }

}
