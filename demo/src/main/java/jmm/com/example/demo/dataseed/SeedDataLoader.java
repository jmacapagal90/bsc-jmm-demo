package jmm.com.example.demo.dataseed;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jmm.com.example.demo.entity.Course;
import jmm.com.example.demo.service.CourseService;
import jmm.com.example.demo.entity.User;
import jmm.com.example.demo.service.UserService;

@Component
public class SeedDataLoader implements CommandLineRunner {

	@Autowired
	private CourseService courseService;

    @Autowired
	private UserService userService;

	@Override
	public void run(String... args) throws Exception {
		loadData();
	}

	private void loadData() {
        User user1 = new User(1,"johndoe1","test1234");
        User user2 = new User(2,"janedoe2","test4321");
        User user3 = new User(3,"jackdoe3","test6789");
        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);
		System.out.println("Seeded Users");




        Course course1 = new Course(1,"Intro to Political Science","Intro to Poli. Science",true,"PS101");
        Course course2 = new Course(2,"Intro to Computer Science","Intro to Comp. Science",true,"CS101");
        Course course3 = new Course(3,"Intro to Applied Sciences","Intro to App. Science",false,"AP101");

        courseService.saveCourse(course1);
        courseService.saveCourse(course2);
        courseService.saveCourse(course3);
		System.out.println("Seeded Courses");
	}
}