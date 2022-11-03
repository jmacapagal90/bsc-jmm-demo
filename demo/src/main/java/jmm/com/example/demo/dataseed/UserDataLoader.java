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
        User user1 = new User(1,"johndoe1","test1234");
        User user2 = new User(2,"janedoe2","test4321");
        User user3 = new User(3,"jackdoe3","test6789");
        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);
		
		System.out.println("Seeded Users");
	}
}