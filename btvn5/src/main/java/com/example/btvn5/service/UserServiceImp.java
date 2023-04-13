package com.example.btvn5.service;

import com.example.btvn5.entity.User;
import com.example.btvn5.repository.UserRepository;
import com.example.btvn5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void SaveUser(User user) {
       List<User> list=userRepository.findAllByUserName(user.getUserName());
       if(list.size()>0){
           throw new RuntimeException();
       }
       else {
           userRepository.save(user);
       }
    }

    @Override
    public boolean UpdateUser(User user) {
        Optional<User> userOptional=userRepository.findById(user.getId()).map(
                user1 -> {
                    user1.setFullName(user.getFullName());
                    user1.setPassWord(user.getPassWord());
                    return userRepository.save(user1);
                }
        );
        return true;
    }

    @Override
    public void DeleteUser(Long id) {
        Optional<User> user=userRepository.findById(id);
        if(user.isPresent()){
            userRepository.deleteById(id);
        }
        else{
            throw new NullPointerException();
        }
    }

    @Override
    public List<User> FindAllUser() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public boolean Login(User user) {
        List<User> list= userRepository.findAllByUserName(user.getUserName());
        for(User u:list){
            if(u.getPassWord().equals(user.getPassWord())){
                return true;
            }
        }
        return false;
    }

    @Override
    public User findUserById(Long id) {
        Optional<User> user= userRepository.findById(id);
        return user.get();
    }
}
