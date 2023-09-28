package com.studentdetails.restdemo.Exeption;

public class ResourceNotFoundExeption extends RuntimeException{
    String resourceName;
    String fieldName;
    int fieldValue;

    public ResourceNotFoundExeption(String resourceName,String fieldName, int fieldValue){
        super(String.format("%s not found with %s : %s",resourceName,fieldName,fieldValue));
        this.fieldName=fieldName;
        this.resourceName=resourceName;
        this.fieldValue=fieldValue;
    }
}
