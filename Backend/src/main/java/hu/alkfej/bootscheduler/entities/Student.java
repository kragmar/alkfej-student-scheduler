package hu.alkfej.bootscheduler.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Student extends Person {

    @Column(nullable = false)
    private LocalDate birthDate;

    @JsonIgnore
    @OneToMany(targetEntity = Lesson.class, mappedBy = "student")
    private List<Lesson> lesson;

    @JoinTable
    @ManyToMany(targetEntity = LessonTicket.class)
    private List<LessonTicket> lessonTicket;
}
