package hu.alkfej.bootscheduler.repositories;

import hu.alkfej.bootscheduler.entities.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {
    Optional<Teacher> findByUsername(String userName);
}
