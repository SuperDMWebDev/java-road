package com.example.javaroad;
import com.example.javaroad.student.Student;
import com.example.javaroad.student.StudentJdbcRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JavaRoadApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentJdbcRepository studentJdbcRepository;

    public static void main(String[] args)
    {
        SpringApplication.run(JavaRoadApplication.class,args);

    }

    @Override
    public void run(String ...args){
        logger.info("Student id 10001",studentJdbcRepository.findById(10001L));
        logger.info("Inserting -> ",studentJdbcRepository.insert(new Student(10010L, "John","A123")));
        logger.info("Update 1003 ",studentJdbcRepository.update(new Student(10001L, "Name-updated","New passport")));

        studentJdbcRepository.deleteById(10002L);

        logger.info("All users" , studentJdbcRepository.findAll());
    }


}
