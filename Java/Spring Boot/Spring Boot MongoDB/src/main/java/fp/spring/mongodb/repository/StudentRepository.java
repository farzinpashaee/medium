package fp.spring.mongodb.repository;

import fp.spring.mongodb.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {

    @Query("{name:'?0'}")
    Optional<Student> findItemByName(String name);

    public long count();

}