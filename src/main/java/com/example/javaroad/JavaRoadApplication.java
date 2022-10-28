package com.example.javaroad;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@SpringBootApplication
public class JavaRoadApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaRoadApplication.class,args);
	}

}
