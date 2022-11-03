package jmm.com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import org.springframework.data.rest.core.annotation.RestResource;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    public Course(int i, String string, String string2, String string3, int j) {
    }

    //attr methods
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String description;
    private String status;

    @Column(name = "username")
    private String username;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;
}
