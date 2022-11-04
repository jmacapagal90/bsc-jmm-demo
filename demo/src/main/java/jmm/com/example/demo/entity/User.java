package jmm.com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {


    //attr methods
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //generates primary key
    private int id;

    @Column(name = "username", unique = true)
    private String username;
    private String password;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "course_user", 
        joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"), 
        inverseJoinColumns = @JoinColumn(name = "user_id", 
        referencedColumnName = "id"))
    private List<Course> course;

    public User(int id, String username, String password) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
    }

}