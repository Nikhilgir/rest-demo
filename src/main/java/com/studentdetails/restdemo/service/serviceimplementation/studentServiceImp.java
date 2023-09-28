package com.studentdetails.restdemo.service.serviceimplementation;

import com.studentdetails.restdemo.Exeption.ResourceNotFoundExeption;
import com.studentdetails.restdemo.model.Student;
import com.studentdetails.restdemo.repository.StudentRepository;
import com.studentdetails.restdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceImp implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    public studentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public String saveStudent(Student student) {
        studentRepository.save(student);
        return "succesfully saved";
    }

    @Override
    public Student findStudent(int id) {
        return studentRepository.findById(id).orElseThrow(()->new ResourceNotFoundExeption("User","Id",id));
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
