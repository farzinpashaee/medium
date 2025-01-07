package fp.spring.shell.service;

import fp.spring.shell.model.Student;
import fp.spring.shell.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Optional<Student> getStudentById( Long id ){
        return studentRepository.findById(id);
    }


}
