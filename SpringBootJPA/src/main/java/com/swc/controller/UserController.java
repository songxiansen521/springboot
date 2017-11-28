package com.swc.controller;

import com.swc.entity.User;
import com.swc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getById(@PathVariable("id") String id){

        return  userRepository.findOne(Integer.valueOf(id));
    }


    @RequestMapping("/save")
    public String addUser(@RequestParam("name")String name,@RequestParam("money")double money,@RequestParam("age")String age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setMoney(money);
        return userRepository.save(user).toString();

    }

}
