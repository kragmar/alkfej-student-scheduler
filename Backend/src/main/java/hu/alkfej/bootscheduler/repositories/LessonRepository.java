package hu.alkfej.bootscheduler.repositories;

import hu.alkfej.bootscheduler.entities.Lesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends CrudRepository<Lesson, Long> {

}
