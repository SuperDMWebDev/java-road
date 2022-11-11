package com.example.javaroad;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class JavaRoadApplication {
    public static void main(String[] args) throws JsonProcessingException {

        SpringApplication.run(JavaRoadApplication.class,args);
          // test with JsonIgnore
//        ExtendableBean bean = new ExtendableBean();
//        bean.add("attr1","val1");
//        bean.add("attr2","val2");
////
//        String result = new ObjectMapper().writeValueAsString(bean);
//
//        System.  out.println(result);

        //create object mapper
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        //create User
        User user = new User(1,"Minh","Pham","Minh Pham");
        //create string of object

        String result= mapper.writeValueAsString(user);

        System.out.println(result);

    }

}
