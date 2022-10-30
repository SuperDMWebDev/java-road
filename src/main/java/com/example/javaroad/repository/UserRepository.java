package com.example.javaroad.repository;

import com.example.javaroad.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmailAddress(String emailAddress);
    List<User> findByLastname (String lastName);

}
