package com.example.javaroad;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class JavaRoadApplication {

	public static void main(String[] args) {
		// create ObjectMapper
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		//create a post
		Post post = new Post();
		post.setTitle("Jackson JSON API Guide");
		post.setId(100L);
		post.setDescription("Post about Jackson JSON API");
		post.setContent("HTML content here");
		post.setLastUpdatedAt(new Date());
		post.setPostedAt(new Date());

		Set<Tag> tags = new HashSet<>();
		Tag java = new Tag(1L, "Java");
		Tag jackson = new Tag(2L, "Jackson");
		Tag json = new Tag(3L, "JSON");
		tags.add(java);
		tags.add(jackson);
		tags.add(json);

		// add tags to post
		post.setTags(tags);

		try {
			// convert object to json stringng
			String postJson = mapper.writeValueAsString(post);
			System.out.println("json " + postJson);

			FileOutputStream fileOutputStream = new FileOutputStream("post.json");
			mapper.writeValue(fileOutputStream, post);
			fileOutputStream.close();

		} catch (Exception e) {
			System.out.println("Exception "+ e);
		}


	}

}
