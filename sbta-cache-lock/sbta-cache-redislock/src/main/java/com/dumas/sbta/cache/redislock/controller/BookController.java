package com.dumas.sbta.cache.redislock.controller;

import com.dumas.sbta.cache.redislock.annotation.CacheLock;
import com.dumas.sbta.cache.redislock.annotation.CacheParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/10 15:28
 */
@RestController
@RequestMapping("/bookds")
public class BookController {
    @CacheLock(prefix = "books")
    @GetMapping
    public String query(@CacheParam(name = "token") @RequestParam String token) {
        return "success - " + token;
    }
}
