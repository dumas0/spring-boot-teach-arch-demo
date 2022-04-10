package com.dumas.sbta.cache.redislock;

import com.dumas.sbta.cache.redislock.annotation.CacheKeyGenerator;
import com.dumas.sbta.cache.redislock.interceptor.LockKeyGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/10 15:15
 */
@SpringBootApplication
public class RedisLocakApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedisLocakApplication.class, args);
    }

    @Bean
    public CacheKeyGenerator cacheKeyGenerator() {
        return new LockKeyGenerator();
    }
}
