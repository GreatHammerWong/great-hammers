package com.greathammers.superhammer.controller;

import com.greathammers.superhammer.entity.User;
import com.greathammers.superhammer.service.HandUserService;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private JPAQueryFactory queryFactory;

    @RequestMapping("/login")
    public String login() {

        HandUserService wx = new HandUserService();
        List<User> userList = wx.login(queryFactory);

        for (User user : userList) {
            System.out.println(user.getUsername());
        }
        return "欢迎来到大锤领域";
    }
}
