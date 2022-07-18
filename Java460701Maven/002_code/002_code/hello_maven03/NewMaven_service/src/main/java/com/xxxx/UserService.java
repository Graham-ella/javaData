package com.xxxx;

public class UserService {

    public void test(){
        System.out.println("service层 参数校验，逻辑判断，调用数据库查询数据");
        UserDao userDao = new UserDao();
        userDao.test();
    }
}
