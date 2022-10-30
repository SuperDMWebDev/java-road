package com.example.javaroad.exception;

public class ResourceNotFoundException extends Exception{
    private static final Long serialVersionUID= 1L;

    public ResourceNotFoundException(String msg)
    {
        super(msg);
    }
}
