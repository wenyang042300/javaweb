package com.wy;

import com.wy.config.SpringConfig;
import com.wy.entity.User;
import com.wy.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {

    @Autowired
    UserService userService;


    @Test
    public void testGet(){
        User user = userService.getById("1");
        System.out.println(user);
    }
}
