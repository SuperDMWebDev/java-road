package com.example.javaroad.controller;


import com.example.javaroad.entity.Student;
import com.example.javaroad.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

// index : students, update-student: student,
@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    @PostConstruct
    public void addExampleStudent(){

    }

    @Autowired
    public StudentController(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    @GetMapping("/signup")
    // pass student and no use;
    public String showSignUpForm(Student student)
    {
        return "add-student";
    }

    @GetMapping("/list")
    public String showUpdateForm(Model model)
    {
        model.addAttribute("students",studentRepository.findAll());
        return "index";
    }
//    overload row
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model)
    {
        Student student = studentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid student Id"+ id));
        System.out.println("student edit " + student.toString());
        model.addAttribute("student",student);
        return "update-student";
    }
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id,Model model)
    {
        Student student= studentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Cannot delete student not exist" + id));
        studentRepository.delete(student);
        model.addAttribute("students",studentRepository.findAll());
        return "index";
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable("id") long id,@Valid Student student, BindingResult result, Model model)
    {
        // if result error
        if(result.hasErrors())
        {
            student.setId(id);
            return "update-student";
        }
        studentRepository.save(student);
        model.addAttribute("students",studentRepository.findAll());
        return "index";
    }

    @PostMapping("add")
    public String addStudent(@Valid Student student, BindingResult result, Model model) {

        // if binding result has error it will return to add student
        System.out.println("go to post add");
        if (result.hasErrors()) {
            return "add-student";
        }
        // ortherwise
        studentRepository.save(student);
        return "redirect:list";
    }





}
