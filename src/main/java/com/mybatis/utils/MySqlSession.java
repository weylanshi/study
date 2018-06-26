package com.mybatis.utils;

import java.lang.reflect.Proxy;

public class MySqlSession {

    // 加载Mapper接口
    public static <T> T getMapper(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),new Class[]{clazz}, new MyORMInvocationHandler());
    }
}
