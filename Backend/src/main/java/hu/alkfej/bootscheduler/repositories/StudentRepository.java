package hu.alkfej.bootscheduler.repositories;

import hu.alkfej.bootscheduler.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
