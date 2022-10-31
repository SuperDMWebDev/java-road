package com.example.javaroad;


import com.example.javaroad.audit.AuditorAwareImpl;
import com.example.javaroad.entity.User;
import com.example.javaroad.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.swing.*;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class JavaRoadApplication {

	@Bean
	public AuditorAware<String> auditorAware()
	{
		return new AuditorAwareImpl();

	}



	public static void main(String[] args)
	{
		SpringApplication.run(JavaRoadApplication.class,args);

	}

}
