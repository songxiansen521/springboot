package com.swc.controller;

import com.swc.entity.User;
import com.swc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chao on 2017-11-27.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/list")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @RequestMapping("/{id}")
    public User getById(@RequestParam("id")String id){
        return (User) userRepository.findOne(id);
    }

    public String addUser(@RequestParam("name")String name,@RequestParam("money")double money,@RequestParam("age")String age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setMoney(money);
        return userRepository.save(user).toString();

    }


}
