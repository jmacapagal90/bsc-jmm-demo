package jmm.com.example.demo.dataseed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jmm.com.example.demo.entity.User;
import jmm.com.example.demo.service.UserService;

@Component
public class UserDataLoader implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Override
	public void run(String... args) throws Exception {
		loadUserData();
	}

	private void loadUserData() {

		System.out.println("Seeded Users");
	}
}