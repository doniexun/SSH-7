package com.codingfanlt.dao;

import com.codingfanlt.entity.User;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class UserDaoImpl implements UserDao {
    // 得到HibernateTemplate对象(HibernateTemplate对Hibernate进行封装)
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void add() {
        System.out.println("UserDaoImpl.add()...");
        // 创建对象进行保存
        User user=new User();
        user.setUsername("Alice");
        user.setAddress("Jepan");
        //调用save方法实现添加
        hibernateTemplate.save(user);


//        HibernateTemplate hibernateTemplate=new HibernateTemplate(sessionfactory);
    }
}
