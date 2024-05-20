package com.wy.service.impl;

import com.wy.entity.User;
import com.wy.mapper.UserMapper;
import com.wy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUser(User user) {
        boolean result = userMapper.addUser(user);
        return result;
    }

    @Override
    public User getByUsername(String username) {
        User result = userMapper.getByUsername(username);
        return result;
    }

    @Override
    public User getById(String id) {
        User result = userMapper.getByUsername(id);
        return result;
    }
}
