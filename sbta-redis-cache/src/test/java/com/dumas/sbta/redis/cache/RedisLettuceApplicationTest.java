package com.dumas.sbta.redis.cache;

import com.dumas.sbta.redis.cache.entity.User;
import com.dumas.sbta.redis.cache.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/06 14:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisCacheApplication.class)
public class RedisLettuceApplicationTest {
    private static final Logger log = LoggerFactory.getLogger(RedisLettuceApplicationTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void testRedisLettuce(){
        final User user = userService.saveOrUpdate(new User(5L, "u5", "p5"));
        log.info("[saveOrUpdate] - [{}]", user);
        final User user1 = userService.get(5L);
        log.info("[get] - [{}]", user1);
        userService.delete(5L);
    }
}
