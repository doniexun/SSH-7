package com.codingfanlt.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
本类运行时数据库将被初始化(数据表将自动被创建)
 */
public class HibernateUtils {
    static Configuration configuration = null;
    static SessionFactory sessionFactory = null;

    //静态代码块实现
    static {
        configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();

    }

    //提供返回session的方法
    public static Session getSessionobject() {
        return sessionFactory.getCurrentSession();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void main(String[] args) {

    }
}
