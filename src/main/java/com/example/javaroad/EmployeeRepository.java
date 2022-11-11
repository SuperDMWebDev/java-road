package com.example.javaroad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {


    @Query("SELECT e from Employee e where e.email = :email")
    Optional<Employee> findByEmail(String email);

    @Query("SELECT e from Employee e where e.firstName LIKE CONCAT('%', :query,'%') Or e.lastName LIKE CONCAT('%', :query, '%')" )
    List<Employee> searchEmployee(String query);
}
