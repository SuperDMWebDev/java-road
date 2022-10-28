package com.example.javaroad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonJsonToPojo {
    public static void main(String[] args) throws IOException {

        // create ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        InputStream fileInputStream = new FileInputStream("post.json");
        Post post = mapper.readValue(fileInputStream, Post.class);
        fileInputStream.close();

        // print post object
        System.out.println("Printing post details");
        System.out.println(post.getId());
        System.out.println(post.getTitle());
        System.out.println(post.getDescription());
        System.out.println(post.getContent());
        System.out.println(post.getLastUpdatedAt());
        System.out.println(post.getPostedAt());

        // print tags of post
        for (Iterator<Tag> iterator = post.getTags().iterator(); iterator.hasNext();) {
            Tag tag = iterator.next();
            System.out.println(tag.getName());

        }

    }
}
