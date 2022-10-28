package com.example.javaroad;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Post {
    private Long id;
    private String title;
    private String description;
    private String content;
    private Date postedAt = new Date();
    private Date lastUpdatedAt = new Date();
    private Set <Tag> tags = new HashSet<>();

    public Post()
    {

    }
    public Post(String title)
}
