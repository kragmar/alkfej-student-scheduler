package hu.alkfej.bootscheduler.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "lesson")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Lesson extends BaseEntity {

    @Column(nullable = false)
    private String lessonStart;

    @Column(nullable = false)
    private String lessonDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private LessonType lessonType;

    @JoinColumn
    @ManyToOne(targetEntity = Student.class)
    private Student student;

    @JoinColumn
    @ManyToOne(targetEntity = Teacher.class)
    private Teacher teacher;
}
