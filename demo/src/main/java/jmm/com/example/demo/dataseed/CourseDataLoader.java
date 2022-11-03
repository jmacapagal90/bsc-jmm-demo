package jmm.com.example.demo.dataseed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jmm.com.example.demo.entity.Course;
import jmm.com.example.demo.service.CourseService;

@Component
public class CourseDataLoader implements CommandLineRunner {

	@Autowired
	private CourseService courseService;

	@Override
	public void run(String... args) throws Exception {
		loadCourseData();
	}

	private void loadCourseData() {
        Course course1 = new Course(1,"Poli Sci 101","Intro to Poli Science","Active","johndoe1");
        Course course2 = new Course(2,"Poli Sci 101","Intro to Poli Science","Active","janedoe1");
        Course course3 = new Course(3,"Poli Sci 101","Intro to Poli Science","Active","jackdoe1");
        Course course4 = new Course(4,"Chocolate 101","Chocolate Making","Active","jackdoe1");
        Course course5 = new Course(5,"Marketing 101","Intro to Marketing","Active","johndoe1");
        Course course6 = new Course(6,"Wine 101","Intro to Wine","Active","janedoe1");
        Course course7 = new Course(7,"Accounting 201","Accounting","Active","jackdoe1");
        Course course8 = new Course(8,"Comp Sci 101","Comp Sci","Active","jackdoe1");


        courseService.saveCourse(course1);
        courseService.saveCourse(course2);
        courseService.saveCourse(course3);
		courseService.saveCourse(course4);
        courseService.saveCourse(course5);
        courseService.saveCourse(course6);
        courseService.saveCourse(course7);
		courseService.saveCourse(course8);
		System.out.println("Seeded Courses");
	}
}