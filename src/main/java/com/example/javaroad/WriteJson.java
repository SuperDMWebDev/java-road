package com.example.javaroad;

import javax.json.*;
import javax.json.stream.JsonGenerator;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class WriteJson {

    private static Post createPost() {
        // create a post
        Post post = new Post();
        post.setTitle("JSONP Tutorial");
        post.setId(100);
        post.setDescription("Post about JSONP");
        post.setContent("HTML content here");

        String[] tags = {
                "Java",
                "JSON"
        };
        // create some predefined tags
        post.setTags(tags);

        // set tags to post
        return post;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Post post = createPost();

        JsonObjectBuilderTest postBuilder = Json.createObjectBuilder();
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();

        for (String tag : post.getTags()) {
            arrayBuilder.add(tag);
        }
        postBuilder.add("id", post.getId())
                .add("title", post.getTitle())
                .add("description", post.getDescription())
                .add("content", post.getContent())
                .add("tags", arrayBuilder);

        JsonObject postJsonObject = postBuilder.build();

        System.out.println("Post JSON String -> " + postJsonObject);

        OutputStream os = new FileOutputStream("posts.json");


        Map<String, Boolean> config = new HashMap<String, Boolean>();

        config.put(JsonGenerator.PRETTY_PRINTING, true);

        JsonWriterFactory jsonWriterFactory = Json.createWriterFactory(config);
        JsonWriter jsonWriter = jsonWriterFactory.createWriter(os);

        jsonWriter.writeObject(postJsonObject);
        jsonWriter.close();
    }


}
