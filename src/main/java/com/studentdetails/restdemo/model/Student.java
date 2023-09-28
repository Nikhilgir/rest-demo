package com.studentdetails.restdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @Column(name = "STUDENT_ID")
    private int id;
    @Column(name = "STUDENT_NAME")
    private String name;
    @Column(name = "STUDENT_ROLL_NO")
    private String rollNo;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addresses;

}
