package com.example.javaroad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JavaRoadApplication {
    public static void main(String[] args) {

        SpringApplication.run(JavaRoadApplication.class,args);
//         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaRoadApplication.class);
//        context.close();
    }

}
