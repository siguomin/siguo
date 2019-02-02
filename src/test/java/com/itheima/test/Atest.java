package com.itheima.test;

import com.itheima.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Atest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService accountService =(AccountService) cs.getBean("accountServiceImpl");

        accountService.saveAccount();

    }
}
