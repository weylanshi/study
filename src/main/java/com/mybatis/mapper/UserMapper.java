package com.mybatis.mapper;

import com.mybatis.annotation.MyInsert;
import com.mybatis.annotation.MyParam;
import com.mybatis.annotation.MySelect;
import com.mybatis.entity.User;

public interface UserMapper {

    @MyInsert("insert into video_user(userName,userAge) values(#{userName},#{userAge})")
    int insertUser(@MyParam("userName")String userName,@MyParam("userAge")Integer userAge);

    @MySelect("select * from video_user where userName = #{userName} and userAge = #{userAge}")
    User selectUser(@MyParam("userName")String userName,@MyParam("userAge")Integer userAge);
}
