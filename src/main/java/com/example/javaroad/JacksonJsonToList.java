package com.example.javaroad;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JacksonJsonToList {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String json = "[ \"C\", \"C++\", \"Java\", \"Java EE\", \"Python\", \"Scala\", \"JavaScript\" ]";

        List<String> proLangs = new ArrayList<String>();
        proLangs = mapper.readValue(json, List.class);

        for(Iterator<String> iterator = proLangs.iterator(); iterator.hasNext();)
        {
            String proLang= (String) iterator.next();
            System.out.println(proLang);

        }



    }
}
