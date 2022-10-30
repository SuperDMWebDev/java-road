package com.example.javaroad.controller;

import com.example.javaroad.exception.ResourceNotFoundException;
import com.example.javaroad.model.Employee;
import com.example.javaroad.repository.EmployeeRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


//only allow localhost:4200 to send cross-origin requests
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    //get all employee
    @GetMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        System.out.println("get all employees");
        return employeeRepository.findAll();
    }

    //employees , id
    // responseentity
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value="id") Long id) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(id).orElseThrow(()->{
            return new ResourceNotFoundException("Employee not found for id "+ id);
        });
        return ResponseEntity.ok().body(employee);

    }

    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee)
    {
        return employeeRepository.save(employee);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long id, @Valid @RequestBody Employee newEmployee) throws ResourceNotFoundException
    {
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> {
            return new ResourceNotFoundException("Employee not found for id "+ id);
        });

        employee.setEmailId(newEmployee.getEmailId());
        employee.setFirstName(newEmployee.getFirstName());
        employee.setLastName(newEmployee.getLastName());
        // can't change final
        final Employee employeeAfterUpdate = employeeRepository.save(employee);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(employeeAfterUpdate);
    }

    @DeleteMapping("/employees/{id}")
    public Map<String,Boolean> deleteEmployee(@PathVariable(value="id") Long id) throws ResourceNotFoundException
    {
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> {
            return new ResourceNotFoundException("Employee not found for id "+ id);
        });
        employeeRepository.delete(employee);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return response;
    }
}
