package com.wy.controller;

import com.wy.entity.User;
import com.wy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userService")
@CrossOrigin
public class UserController {

    //注入userSevice
    @Autowired
    private UserService userService;

    @GetMapping("login/{username}/{password}")
    public Boolean login(@PathVariable String username,@PathVariable String password){
        User user = userService.getByUsername(username);
        if(user==null){
            return false;  //用户名不存在,返回null;
        }
        if(!user.getPassword().equals(password)){
            return false;  //密码输入错误
        }
        return true;
    }

    @PostMapping("register")
    public boolean register(@RequestBody User user){
        //判断数据库是否已存在id 保证id值唯一
        User one = userService.getById(user.getId());
        if(one!=null){
            //id不唯一
            return false;
        }
        //执行插入
        boolean addUser = userService.addUser(user);
        return addUser;
    }
}
