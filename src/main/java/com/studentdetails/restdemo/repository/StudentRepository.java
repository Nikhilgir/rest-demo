package com.studentdetails.restdemo.repository;

import com.studentdetails.restdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
