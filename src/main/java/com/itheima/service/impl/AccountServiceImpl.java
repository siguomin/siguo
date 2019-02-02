package com.itheima.service.impl;

import com.itheima.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    public void saveAccount() {
        System.out.println("保存信息了");
    }
}
