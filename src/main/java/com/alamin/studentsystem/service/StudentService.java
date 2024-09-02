package com.alamin.studentsystem.service;

import com.alamin.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
