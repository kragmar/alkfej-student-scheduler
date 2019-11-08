package hu.alkfej.bootscheduler.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String telNum;

    @Column(nullable = false)
    private String email;
}
