package com.example.btvn5.controller;

import com.example.btvn5.entity.User;
import com.example.btvn5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public ResponseEntity<?> SaveUser(@RequestBody User user){
        userService.SaveUser(user);
        return ResponseEntity.ok().body(userService.FindAllUser());
    }
    @GetMapping("/edit")
    public String EditUser(@RequestParam(name = "id") Long id,Model model){
        model.addAttribute("user",userService.findUserById(id));
        return "edit";
    }
    @PostMapping("/edit")
    public String UpdateUser(@ModelAttribute User user){
        userService.UpdateUser(user);
        return "redirect:about";
    }
    @GetMapping("/delete")
    public String DeleteUser(@RequestParam(name = "id") Long id){
        userService.DeleteUser(id);
        return "redirect:about";
    }
    @GetMapping(value = {"login","/"})
    public String login(){
        return "login";
    }
    @PostMapping("/login")
    public String Login(@ModelAttribute User user, Model model){
        if(userService.Login(user)){
            return "redirect:about";
        }
        model.addAttribute("warning","Thông tin không chính xác!");
        return "login";
    }
    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("list",userService.FindAllUser());
        return "about";
    }
    @GetMapping("/sign")
    public String sign(){
        return "sign";
    }
    @PostMapping("/sign")
    public String Sign(@ModelAttribute User user){
        userService.SaveUser(user);
        return "redirect:about";
    }
    @GetMapping("/view")
    public ResponseEntity<?> View(){
        return ResponseEntity.ok(userService.FindAllUser());
    }

}
