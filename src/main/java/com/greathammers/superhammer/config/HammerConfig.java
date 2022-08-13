package com.greathammers.superhammer.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.persistence.EntityManager;

@Configuration
public class HammerConfig {

    @Autowired
    private EntityManager entityManager;

    /**
     * 定义JPA配置
     */

    @Bean
    public JPAQueryFactory getQueryFactory() {
        return new JPAQueryFactory(entityManager);
    }


}
