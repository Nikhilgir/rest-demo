package com.studentdetails.restdemo.service;

import com.studentdetails.restdemo.model.Student;

import java.util.List;

public interface StudentService {
    public String saveStudent(Student student);
    public Student findStudent(int id);
    public List<Student> findAll();
}
