package com.studentdetails.restdemo.controller;

import com.studentdetails.restdemo.apiResponse.ApiResponse.ApiResponse;
import com.studentdetails.restdemo.model.Address;
import com.studentdetails.restdemo.model.Student;
//import com.studentdetails.restdemo.service.AddressService;
import com.studentdetails.restdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;
//    @Autowired
//    AddressService addressService;


    @PostMapping("/savestudent")
    public ResponseEntity<ApiResponse> saveStudent(@RequestBody Student student){
        String s=studentService.saveStudent(student);
        return new ResponseEntity<>(new ApiResponse("successfully done",true), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public Student getStudentById(@PathVariable("id")  int id){
        return studentService.findStudent(id);
    }
    @GetMapping("/getallvalue")
    public List<Student> getAllStudents(){
        return studentService.findAll();
    }



    @GetMapping("/st")
    public Student st(){
        Student s=new Student();
        Address address=new Address();
        Address address1=new Address();
        Address address2=new Address();

        s.setId(3);
        s.setName("Nikhil");
        s.setRollNo("0821cs201081");

        address.setAddress_id(3);
        address.setVil("Jamo");
        address.setTown("siwan");
        address.setState("Bihar");

        address1.setAddress_id(4);
        address1.setVil("Bhamori");
        address1.setTown("indore");
        address1.setState("MP");

        address2.setAddress_id(5);
        address2.setVil("khoda");
        address2.setTown("Noida");
        address2.setState("UP");

        ArrayList<Address> arr=new ArrayList<>();
        arr.add(address);
        arr.add(address1);
        arr.add(address2);
        s.setAddresses(arr);

        studentService.saveStudent(s);

        return s;
    }
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
}
