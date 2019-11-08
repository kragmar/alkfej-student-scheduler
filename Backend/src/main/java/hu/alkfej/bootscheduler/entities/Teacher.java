package hu.alkfej.bootscheduler.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teacher")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Teacher extends Person {

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private boolean enabled;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(targetEntity = Lesson.class, mappedBy = "teacher")
    private List<Lesson> lesson;
}
