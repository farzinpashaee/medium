package fp.spring.mongodb.controller;

import fp.spring.mongodb.model.Student;
import fp.spring.mongodb.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    MongoTemplate mongoTemplate;

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> getStudentById(@PathVariable String id ){
        Teacher teacher = mongoTemplate.findById(id,Teacher.class);
        if( teacher == null )
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(teacher);
    }

    @GetMapping("name/{name}")
    public ResponseEntity<Teacher> getStudentByName(@PathVariable String name ){
        Teacher teacher= mongoTemplate.findOne(Query.query(Criteria.where("name").is(name)), Teacher.class);
        return ResponseEntity.ok(teacher);
    }

    @PostMapping("/add")
    public ResponseEntity<?> getStudent(@RequestBody Teacher teacher ){
        mongoTemplate.save(teacher);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
