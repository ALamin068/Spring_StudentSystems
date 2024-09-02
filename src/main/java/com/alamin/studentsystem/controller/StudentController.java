package com.alamin.studentsystem.controller;

import com.alamin.studentsystem.model.Student;
import com.alamin.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin("http://localhost:3000")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student added";
    }
    @GetMapping("/allStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Student getUserById(@PathVariable Long id){
        return studentService.getById(id);
    }


}
