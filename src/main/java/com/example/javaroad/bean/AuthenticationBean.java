package com.example.javaroad.bean;

//use to print success mesage to user
public class AuthenticationBean {
    private String message;

    public AuthenticationBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return String.format("Bean Message [message=%s]",message);
    }
}
