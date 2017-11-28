package com.swc.service;

import com.swc.dao.UserMapper;
import com.swc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chao on 2017-11-28.
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public int add(String name,double money,String age){
       return  userMapper.add(name,money,age);
    }

    public User findUser(int id) {
        return userMapper.findUser(id);
    }
}
