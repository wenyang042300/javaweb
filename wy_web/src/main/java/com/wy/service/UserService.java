package com.wy.service;

import com.wy.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    

    //增加用户
    boolean addUser(User user);

    //根据username查询用户
    User getByUsername(String username);

    User getById(String id);
}
