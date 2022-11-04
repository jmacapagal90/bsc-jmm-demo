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

    //attr methods
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int course_id;

    private String name;
    private String description;
    private String status;

    @Column(name = "username")
    private String username;


    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;


    public Course(int course_id, String name, String description, String status, String username) {
        super();
        this.course_id = course_id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.username = username;

    }

    public void setUser(User user){
        this.user = user;
    }

    public User getUser(){
        return user;
    }

}
