package com.example.demo;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserServicePath;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.util.List;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
	@Bean
	public ModelMapper mapper(){
		return new ModelMapper();
	}

	@Autowired
	UserRepository userRepository;
	@Autowired
	UserServicePath userServicePath;

	@Value("${directory.root}")
	String root;
	String directory="";

	@Override
	public void run(String... args) throws Exception {

		userRepository.save(new User(null,"user1","123","bo","yacine"));
		userRepository.save(new User(null,"user2","123","bo","yacine"));
		userRepository.save(new User(null,"user3","123","bo","yacine"));

		System.out.println(userServicePath.getUserPath(1L));

		List<User> users=userRepository.findAll();
		users.forEach(user -> {
			directory= root + user.getUserName();
			File file = new File(directory);
			if (file.mkdirs()) {
				System.out.println("created");
			}
		});


	}
}

