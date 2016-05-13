package com.hong;

import com.hong.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
@EnableAutoConfiguration
public class Application  implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger(Application.class) ;
    public static void main(String[] args) {
        ApplicationContext ctx=  SpringApplication.run(Application.class, args);
    }


    @Autowired
    UserMapper userMapper ;

    @Override
    public void run(String... strings) throws Exception {
        logger.info(userMapper.getUser("25").toString()) ;
    }
}