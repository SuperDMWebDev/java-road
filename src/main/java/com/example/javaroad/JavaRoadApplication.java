package com.example.javaroad;


import com.example.javaroad.entity.User;
import com.example.javaroad.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JavaRoadApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(JavaRoadApplication.class,args);
	}

	@Override
	public void run(String ...args) throws Exception {
		User user = new User();
		user.setActive(1);
		user.setAge(28);
		user.setEmailAddress("ramesh24@gmail.com");
		user.setFirstname("Ramesh");
		user.setLastname("Fadatare");
		user.setStartDate(new Date());
		user = userRepository.save(user);

		System.out.println("------------------" + user.getId());
		System.out.println(" ---------------@NamedQuery ---------------------");
		System.out.println("--------------findByEmailAddress -----------------");

		User user2 = userRepository.findByEmailAddress("ramesh24@gmail.com");
		System.out.println(user2.toString());

		System.out.println(" ---------------@NamedQuery ---------------------");
		System.out.println("--------------findByLastname -----------------");

		List< User > user3 = userRepository.findByLastname("Fadatare");
		System.out.println(user3.get(0).toString());

	}

}
