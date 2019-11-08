package hu.alkfej.bootscheduler.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "lesson_ticket")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class LessonTicket extends BaseEntity {

    @Column(nullable = false)
    private LocalDate validFrom;

    @Column(nullable = false)
    private LocalDate validTill;

    @Column(nullable = false)
    private String ticketName;

    @JsonIgnore
    @ManyToMany(targetEntity = Student.class, mappedBy = "lessonTicket")
    private List<Student> student;
}
