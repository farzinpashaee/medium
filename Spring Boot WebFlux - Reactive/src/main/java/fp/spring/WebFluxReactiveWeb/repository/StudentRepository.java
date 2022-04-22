package fp.spring.WebFluxReactiveWeb.repository;

import fp.spring.WebFluxReactiveWeb.model.Student;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface StudentRepository extends R2dbcRepository<Student, Long> {
}
