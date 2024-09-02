package com.alamin.studentsystem.repo;

import com.alamin.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
