package com.example.btvn5.service;

import com.example.btvn5.entity.User;

import java.util.List;

public interface UserService {
    void SaveUser(User user);
    boolean UpdateUser(User user);
    void DeleteUser(Long id);
    List<User> FindAllUser();
    boolean Login(User user);
    User findUserById(Long id);
}
