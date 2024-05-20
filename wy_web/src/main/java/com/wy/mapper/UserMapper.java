package com.wy.mapper;

import com.wy.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("com.wy")
@Mapper
public interface UserMapper {

    //根据id查询user
    @Select("select * from user where username= #{username}")
    User getByUsername(String username);

    //增加用户
    @Insert("insert into user values (#{id},#{username},#{password},#{mes}))")
    boolean addUser(User user);
}
