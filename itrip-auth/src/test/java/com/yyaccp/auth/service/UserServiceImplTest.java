package com.yyaccp.auth.service;

import com.yyaccp.beans.pojo.ItripUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceImplTest {
    private static ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void login() throws Exception {
        UserService userService = (UserService)ctx.getBean("userServiceImpl");
        ItripUser user = userService.login("itrip@163.com","e10adc3949ba59abbe56e057f20f883e");
        Assert.assertTrue(user!=null);
    }
}