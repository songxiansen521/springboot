package com.swc.controller;

import com.swc.entity.User;
import com.swc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chao on 2017-11-28.
 */
@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/insert",method= RequestMethod.GET)
    public int save(@RequestParam(value="name")String name,@RequestParam(value="money")double money,
                    @RequestParam(value="age")String age) {
        return userService.add(name,money,age);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getAccountById(@PathVariable("id") int id) {
        return userService.findUser(id);
    }
}
