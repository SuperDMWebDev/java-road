package com.example.javaroad;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.List;

public class JacksonListToJson {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        List<String> progLangs = new ArrayList<String>();
        progLangs.add("C");
        progLangs.add("C");
        progLangs.add("C++");
        progLangs.add("Java");
        progLangs.add("Java EE");
        progLangs.add("Python");
        progLangs.add("Scala");
        progLangs.add("JavaScript");

        //Serialize Object to Json
        String json = mapper.writeValueAsString(progLangs);

    }
}
