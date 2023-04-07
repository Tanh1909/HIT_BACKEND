package com.example.buoi_4;

import com.example.buoi_4.Exception.ExceptionResponse;
import com.example.buoi_4.Exception.Null;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class UserController {
    @GetMapping("/")
    public ResponseEntity<?> getUser(){
        User u=null;
        if(u==null){
           throw new Null("hello");
        }
        System.out.println(u);
        return ResponseEntity.ok("khong co loi gi het!");
    }


}