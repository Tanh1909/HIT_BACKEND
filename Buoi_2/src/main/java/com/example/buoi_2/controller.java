package com.example.buoi_2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.AttributedString;
import java.util.ArrayList;
import java.util.List;

@Controller
public class controller {
    @RequestMapping("/")
    public String index(Model model){
        return "index";

    }
    @GetMapping("/login")
        public String login(){
            return "login";
        }
    @PostMapping("/login")
    public String login1(@RequestParam("user")String user,@RequestParam("password")String password,Model model){
        if(user.equals("admin")&&password.equals("admin123")){
            return "redirect:about";
        }
        else{
            model.addAttribute("warning","Sai thông tin đăng nhập!");
            return "login";
        }

    }
    @GetMapping("/about")
    public String about(Model model){
        List<Student> list = new ArrayList<>();
        list.add(new Student("M001","Nguyễn Văn A",20));
        list.add(new Student("M002","Nguyễn Văn B",20));
        list.add(new Student("M003","Nguyễn Văn C",20));
        list.add(new Student("M004","Nguyễn Văn D",20));
        model.addAttribute("list",list);
        return "about";
    }
}

