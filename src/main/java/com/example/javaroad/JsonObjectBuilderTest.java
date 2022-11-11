package com.example.javaroad;

import javax.json.*;
import javax.json.stream.JsonGenerator;
import java.io.StringWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class JsonObjectBuilderTest {
    public static void main(String[] args) throws Exception {
        String postedDate = LocalDate.of(2019, 7, 15).toString();

        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder()
                .add("id", "100")
                .add("title", "JSON-Processing API Post")
                .add("description", "JSON-Processing API Post")
                .add("postedDate", postedDate);

        JsonObject jsonObject = jsonObjectBuilder.build();

        Map<String,Object> config = new HashMap<String,Object>();
        config.put(JsonGenerator.PRETTY_PRINTING, true);

        JsonWriterFactory jwf = Json.createWriterFactory(config);
        StringWriter writer = new StringWriter();

        try (JsonWriter jsonWriter = jwf.createWriter(writer)) {
            jsonWriter.writeObject(jsonObject);
            System.out.println(writer);
        }

    }
}
