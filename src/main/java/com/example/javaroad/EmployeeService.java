package com.example.javaroad;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    Employee saveEmployee(Employee employee) throws ResourceNotFoundException;
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(long id);
    Employee updateEmployee(Employee updatedEmployee);
    void deleteEmployee(long id);

    List<Employee> searchEmployee(String query);
}
