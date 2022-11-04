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
		Course course2 = new Course(2,"Comp Sci 101","Intro to Comp. Science","Active","janedoe1");
		Course course3 = new Course(3,"Applied Sci 101","Intro to Applied Science","Active","jackdoe1");
		
        courseService.saveCourse(course1);
		courseService.saveCourse(course2);
		courseService.saveCourse(course3);

		System.out.println("Seeded Courses");
	}
}