package com.codingfanlt.service;

import com.codingfanlt.dao.UserDao;
import com.codingfanlt.dao.UserDaoImpl;
import org.springframework.transaction.annotation.Transactional;

@Transactional//事务注解
public class UserService {
    // 注入Dao对象
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("Service.add()...");
        userDao.add();
//        UserDao userDao = new UserDaoImpl();//接口相当于一种标记;
    }
}
