package com.lincoco.linxiaoen;

import lombok.extern.slf4j.Slf4j;
import love.forte.simbot.spring.autoconfigure.EnableSimbot;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableSimbot
@EnableScheduling
@SpringBootApplication
@MapperScan(basePackages = {"com.lincoco.linxiaoen.dao"})
@Slf4j
public class LinxiaoenApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinxiaoenApplication.class, args);
        log.info("机器人启动成功～～～～～");
    }


}
