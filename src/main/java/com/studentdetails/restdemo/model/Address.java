package com.studentdetails.restdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Address {

    @Id
    @Column(name = "Address_Id")
    private int address_id;
    @Column(name = "Address_Village")
    private String vil;

    @Column(name = "Address_Town")
    private String town;

    @Column(name = "Address_State")
    private String state;

}
