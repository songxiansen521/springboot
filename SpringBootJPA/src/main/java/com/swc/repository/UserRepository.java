package com.swc.repository;

import com.swc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chao on 2017-8-22.
 */

public interface UserRepository extends JpaRepository<User,Integer>{


}
