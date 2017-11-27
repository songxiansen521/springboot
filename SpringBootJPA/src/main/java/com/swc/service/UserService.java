package com.swc.service;

/**
 * Created by chao on 2017-8-22.
 */

public interface UserService {

    void createUser(String name,String age);

    void deleteByName(String name);

    Integer getAllUsers();

    void deleteAllUsers();


}
