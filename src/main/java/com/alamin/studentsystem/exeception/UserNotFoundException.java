package com.alamin.studentsystem.exeception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not find the student with id " + id);
    }
}
