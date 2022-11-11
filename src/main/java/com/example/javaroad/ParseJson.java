package com.example.javaroad;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParserFactory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ParseJson {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("parse-json.json");

        JsonParserFactory jsonParserFactory = Json.createParserFactory(null);
        JsonParser jsonParser = jsonParserFactory.createParser(is, StandardCharsets.UTF_8);

        if(!jsonParser.hasNext() && jsonParser.next() != JsonParser.Event.START_ARRAY)
        {
            return;
        }
        while(jsonParser.hasNext())
        {
            // get object
            JsonParser.Event event = jsonParser.next();

            if(event == JsonParser.Event.KEY_NAME) // represent in JSON object
            {
                // get key
                String key = jsonParser.getString();

                switch (key) {

                    case "id":
                        jsonParser.next();

                        System.out.printf("id: %s%n", jsonParser.getString());
                        break;

                    case "title":
                        jsonParser.next();

                        System.out.printf("title: %s%n", jsonParser.getString());
                        break;

                    case "description":
                        jsonParser.next();

                        System.out.printf("description: %s%n", jsonParser.getString());
                        break;

                    case "content":
                        jsonParser.next();

                        System.out.printf("content: %s%n%n  ", jsonParser.getString());
                        break;
                }
            }

        }
    }
}
