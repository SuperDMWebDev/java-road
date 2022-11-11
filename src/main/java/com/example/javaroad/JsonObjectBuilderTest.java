package com.example.javaroad;

import javax.json.Json;
import javax.json.JsonObject;
import java.time.LocalDate;

public class JsonObjectBuilder {
    public static void main(String[] args) throws Exception {
        String postedDate = LocalDate.of(2019, 7, 15).toString();

        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder()
                .add("id", "100")
                .add("title", "JSON-Processing API Post")
                .add("description", "JSON-Processing API Post")
                .add("postedDate", postedDate);

        JsonObject jsonObject = jsonObjectBuilder.build();

    }
}
