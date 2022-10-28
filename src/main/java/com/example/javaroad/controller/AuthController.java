package com.example.javaroad.controller;


import com.example.javaroad.bean.AuthenticationBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//only allow localhost:4200 to send cross-origin requests
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins="http://localhost:8080")
public class AuthController {
    @GetMapping("/basicauth")
    public AuthenticationBean basicauth()
    {
        return new AuthenticationBean("You are authenticated");
    }
}
