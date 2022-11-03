package jmm.com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}