package com.example.buoi_4.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionCustom {
    @ExceptionHandler(Null.class)
    public ResponseEntity<?> abc(Null abc){
        return ResponseEntity.ok(new ExceptionResponse(abc.getMessage(),HttpStatus.BAD_GATEWAY));
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> abcd(){
        return ResponseEntity.ok("exception");
    }
    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<?> out(){
        return ResponseEntity.ok("out");
    }
}
