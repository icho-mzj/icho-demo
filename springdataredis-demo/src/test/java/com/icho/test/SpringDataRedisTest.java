package com.icho.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: icho
 * @Date: 2022/7/18 18:45
 * @Describe:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringDataRedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test01() {
        //redisTemplate.opsForValue().set("username123", "111");
        Object o = redisTemplate.opsForValue().get("username123");
        System.out.println("o = " + o);
    }
}
