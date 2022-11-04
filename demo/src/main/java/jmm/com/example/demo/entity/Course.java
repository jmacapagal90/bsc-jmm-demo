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

public class Course {

    //attr methods
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int course_id;

    private String name;
    private String description;
    private String status;

    @Column(name = "username")
    private String username;



}
