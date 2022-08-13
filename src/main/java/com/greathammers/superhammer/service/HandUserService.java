package com.greathammers.superhammer.service;

import com.greathammers.superhammer.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.greathammers.superhammer.entity.QUser.quser;

@Service
public class HandUserService {

    public List<User> login(com.querydsl.jpa.impl.JPAQueryFactory queryFactory) {
        List<User> userList;
        userList = queryFactory.selectFrom(quser).fetch();
        return userList;
    }


    public static void main(String[] args) {
        System.out.println("我是主程序测试");
    }
}
