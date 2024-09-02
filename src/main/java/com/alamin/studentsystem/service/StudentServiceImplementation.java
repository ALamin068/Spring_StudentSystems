package com.alamin.studentsystem.service;

import com.alamin.studentsystem.exeception.UserNotFoundException;
import com.alamin.studentsystem.model.Student;
import com.alamin.studentsystem.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepo studentRepo;


    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student getById(long id) {
        return studentRepo.findById(id)
                .orElseThrow(()->new UserNotFoundException(id));
    }

}
