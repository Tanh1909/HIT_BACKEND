package com.example.btvn5.repository;

import com.example.btvn5.entity.User;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findAllByUserName(String userName);

}
