package jmm.com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import javax.persistence.*;

import org.springframework.data.rest.core.annotation.RestResource;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")

public class Course {



    //attr methods
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String description;
    private String status;

    @Column(name = "username")
    private String username;

    @ManyToMany(mappedBy = "course")
    private List<User> users;

    public Course(int id, String name, String description, String status,String username) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.username = username;
    }

}
