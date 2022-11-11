package com.example.javaroad;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IgnoreFieldTest {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        CustomerDTO dtoObject= new CustomerDTO("1","Tony","Stark");
        String dtoAsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(dtoObject);
        System.out.println(dtoAsString);
    }
}
