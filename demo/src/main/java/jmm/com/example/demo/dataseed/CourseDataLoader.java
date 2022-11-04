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

		System.out.println("Seeded Courses");
	}
}