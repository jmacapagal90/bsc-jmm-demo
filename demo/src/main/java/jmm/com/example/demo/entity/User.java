package jmm.com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")

public class User {

    //attr methods
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //generates primary key
    private int user_id;

    @Column(name = "username", unique = true)
    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Course> courses;

    private User user;


    public User(int user_id, String username, String password) {
        super();
        this.user_id = user_id;
        this.username = username;
        this.password = password;
    }

    public void setUser(User user){
        this.user = user;
    }
}