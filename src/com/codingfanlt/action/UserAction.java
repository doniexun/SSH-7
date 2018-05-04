package com.codingfanlt.action;

import com.codingfanlt.entity.User;
import com.codingfanlt.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/*
Action中注入Service
 */
public class UserAction extends ActionSupport {

    private UserService userService;
    /*通过配置文件注入Service所需的方法*/
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("userAction::Spring-Struts2整合完成");
        userService.add();
        return NONE;
    }
}
