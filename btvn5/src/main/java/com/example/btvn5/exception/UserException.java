package com.example.btvn5.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserException {
    @ExceptionHandler(Exception.class)
    public ExceptionCustom Exception(){
        return new ExceptionCustom("UNKNOW EXCEPTION",500);
    }
    @ExceptionHandler(NullPointerException.class)
    public ExceptionCustom NullPointer(){
        return new ExceptionCustom("Không tìm thấy user",404);
    }
    @ExceptionHandler(RuntimeException.class)
    public ExceptionCustom Runtime(){
        return new ExceptionCustom("Trùng tên username",404);
    }
}
