package jmm.com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(int i, String string, String string2, String string3, int jname = "courses_table")
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

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
