package com.swc.service.impl;

import com.swc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by chao on 2017-8-22.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(String name, String age) {
        jdbcTemplate.update("insert into User(name,age) value(?,?)", name, age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from User where name=?", name);

    }

    @Override
    public Integer getAllUsers() {

        return jdbcTemplate.queryForObject("select count(1) from User",Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("delete from User");
    }
}
