package com.mybatis;

import com.mybatis.entity.User;
import com.mybatis.mapper.UserMapper;
import com.mybatis.utils.MySqlSession;

public class Client {

    public static void main(String[] args) {
        // 使用动态代理调用Mapper接口方法
        UserMapper userMapper = MySqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUser("Evan", 88);
        if (user != null) {
            System.out.println(
                    "select result:" + user.getUserName() + "," + user.getUserAge() +
                            ",id:" + user.getId());

        }else{
            System.out.println("select result: No result!" );
        }

        int res = userMapper.insertUser("Evan", 88);
        System.out.println("insert result:" + res);
    }
}
