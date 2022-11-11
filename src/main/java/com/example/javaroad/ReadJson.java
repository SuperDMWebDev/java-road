package com.example.javaroad;

import javax.json.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadJson {

    public static void main(String[] args) throws Exception {
    // create FileInputStream -> create JsonReader -> create JsonObject
    InputStream fis = new FileInputStream("posts.json");

    JsonReader jsonReader =  Json.createReader(fis);

    JsonObject jsonObject =  jsonReader.readObject();

    jsonReader.close();
    fis.close();

    //retrieve data from JsonObject and create Post bean
    Post post = new Post();
    post.setId(jsonObject.getInt("id"));
    post.setTitle(jsonObject.getString("title"));
    post.setDescription(jsonObject.getString("description"));
    post.setContent(jsonObject.getString("content"));

    // reading arrays from json  ( jsonArray = [ jsonValue] => String[])
        JsonArray jsonArray = jsonObject.getJsonArray("tags");
        String[] tags = new String[jsonArray.size()];
        int index = 0;
        for(JsonValue value: jsonArray)
        {
            tags[index++] = value.toString();
        }
        post.setTags(tags);
        System.out.println(post.toString());

    }
}
