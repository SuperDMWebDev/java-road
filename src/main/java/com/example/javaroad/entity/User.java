package com.example.javaroad.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="users")
@NamedQuery(name="User.findByEmailAddress", query= "select u from User u where u.emailAddress = ?1")
@NamedQueries(
        value= {
                @NamedQuery(name="User.findByLastName",query="select u from User u where u.lastname = ?1")
        }
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private Date startDate;
    private String emailAddress;
    private int age;
    private int active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", startDate=" + startDate +
                ", emailAddress='" + emailAddress + '\'' +
                ", age=" + age +
                ", active=" + active +
                '}';
    }
}