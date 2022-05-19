package fp.string.ExceptionHandling.service;

import fp.string.ExceptionHandling.exceptions.InvalidIdException;
import fp.string.ExceptionHandling.exceptions.ServiceDownTimeException;
import fp.string.ExceptionHandling.model.Student;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class StudentService {

    public Student findStudentById( Long id ) throws InvalidIdException, ServiceDownTimeException {
        Calendar calendar = Calendar.getInstance();
        if( calendar.get(Calendar.HOUR_OF_DAY) == 1  )
            throw new ServiceDownTimeException("1-2 AM is service downtime!");
        if( id == null ) throw new InvalidIdException("Invalid ID");
        return new Student().setId(id).setName("Name " + id);
    }

}
