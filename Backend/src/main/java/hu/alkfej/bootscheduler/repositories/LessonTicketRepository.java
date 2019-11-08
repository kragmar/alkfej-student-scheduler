package hu.alkfej.bootscheduler.repositories;

import hu.alkfej.bootscheduler.entities.LessonTicket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonTicketRepository extends CrudRepository<LessonTicket, Long> {

}
