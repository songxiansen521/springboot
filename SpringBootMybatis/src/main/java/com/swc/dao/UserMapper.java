package com.swc.dao;

import com.swc.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by chao on 2017-11-28.
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user(name,money,age)values (#{name},#{money},#{age})")
    int add(@Param("name")String name,@Param("money")double money,@Param("age")String age);

    @Select("select id, name as name, money as money ,age as age from user where id = #{id}")
    User findUser(@Param("id") int id);

}
