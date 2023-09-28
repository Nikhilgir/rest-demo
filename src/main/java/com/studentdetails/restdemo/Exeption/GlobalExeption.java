package com.studentdetails.restdemo.Exeption;

import com.studentdetails.restdemo.apiResponse.ApiResponse.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExeption {
    @ExceptionHandler(ResourceNotFoundExeption.class)
    public ResponseEntity<ApiResponse> resourceNotFoundExeption(ResourceNotFoundExeption ex){
        String msg=ex.getMessage();
        ApiResponse apiResponse=new ApiResponse(msg,false);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
    }
}
