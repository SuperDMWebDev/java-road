package com.example.javaroad.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "name is mandatory")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "email is mandatory")
    @Column(name = "email")
    private String email;

    @Column(name="phone_no")
    private Long phoneNo;

    public Student(){

    }

    public Student(String name, String email)
    {
        this.name= name;
        this.email= email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }
}
