package com.example.javaroad;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class JavaRoadApplication {
    public static void main(String[] args) throws JsonProcessingException {

        SpringApplication.run(JavaRoadApplication.class,args);


    }

}
