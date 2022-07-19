package com.icho;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: icho
 * @Date: 2022/6/30 17:51
 * @Describe:
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableTransactionManagement
@MapperScan
public class IchoApplication {
    public static void main(String[] args) {
        SpringApplication.run(IchoApplication.class, args);
    }
}
