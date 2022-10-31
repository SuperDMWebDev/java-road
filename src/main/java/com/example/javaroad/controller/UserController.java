package com.example.javaroad.controller;

import com.example.javaroad.entity.Product;
import com.example.javaroad.exception.ResourceNotFoundException;
import com.example.javaroad.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UserController {
//
//    @Autowired
//    private ProductRepository userRepository;
//
//    @GetMapping("/users")
//    public List<Product> getAllUsers()
//    {
//        return userRepository.findAll();
//    }
//
//    @GetMapping("/users/{id}")
//    public ResponseEntity<Product> getUserById(@PathVariable(value="id") Long id) throws ResourceNotFoundException {
//        Product user = userRepository.findById(id).orElseThrow(()->{
//            return new ResourceNotFoundException("Cannot find user with id="+id);
//        });
//        return ResponseEntity.ok().body(user);
//    }
//    @PostMapping("/users")
//    public ResponseEntity<Product> createUser(@Valid @RequestBody Product user)
//    {
//        Product newUser = userRepository.save(user);
//        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
//    }
//
//    @PutMapping("/users/{id}")
//    public ResponseEntity<Product> updateUser(@PathVariable(value="id",required = true) Long id, @Valid @RequestBody Product user) throws ResourceNotFoundException
//    {
//        Product newUser = userRepository.findById(id).orElseThrow(()-> {
//            return new ResourceNotFoundException("Cannot find user with id=" + id);
//        });
//        newUser.setFirstName(user.getFirstName());
//        newUser.setLastName(user.getLastName());
//        newUser.setEmailId(user.getEmailId());
//        newUser.setLastModifiedDate(new Date());
//
//        final Product savedUser = userRepository.save(newUser);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(savedUser);
//    }
//
//    @DeleteMapping("/users/{id}")
//    public Map<String,Boolean> deleteUser(@PathVariable(value="id") Long id) throws ResourceNotFoundException
//    {
//        Product user = userRepository.findById(id).orElseThrow(()-> {
//            return new ResourceNotFoundException("Cannot find User with id="+id);
//        });
//        userRepository.delete(user);
//        Map<String ,Boolean> response = new HashMap<>();
//        response.put("deleted",Boolean.TRUE);
//        return response;
//    }


}
