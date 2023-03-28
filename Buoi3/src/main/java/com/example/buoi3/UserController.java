package com.example.buoi3;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
    UserImplement userI=new UserImplement();
    @GetMapping(value = {"/","/login"})
    public String login(){
        return "login";
    }
    @PostMapping("login")
    public String loginImplement(@ModelAttribute User user, Model model){
        System.out.println(userI.login(user));
        if(userI.login(user)){
            return "redirect:about";
        }
        if(user.getUser().equals("")||user.getPassword().equals("")){
            model.addAttribute("warning","không được để trống thông tin!");
        }
        else{
            model.addAttribute("warning","Tài Khoản hoặc mật khẩu không chính xác!");
        }
        return "login";
    }
    @GetMapping("signup")
    public String sign(){

        return "signup";
    }
    @PostMapping("signup")
    public String signupImplement(@ModelAttribute User user, Model model){
        if(user.getUser().equals("")||user.getPassword().equals("")||user.getFullname().equals("")){
            model.addAttribute("warning","không được để trống thông tin!");
            return "signup";
        }
        else if(userI.timUser(user.getUser())){
            model.addAttribute("warning","Tài Khoản đã tồn tại!");
            return "signup";
        }
        userI.themUser(user);
        return "redirect:login";
    }
    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("list",userI.getList());
        return "about";
    }
    @GetMapping("/view")
    public ResponseEntity<?> view(){
        return ResponseEntity.ok(userI.getList());
    }
}
