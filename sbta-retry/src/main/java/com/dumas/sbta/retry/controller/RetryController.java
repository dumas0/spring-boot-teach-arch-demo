package com.dumas.sbta.retry.controller;

import com.dumas.sbta.retry.service.RetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/10 22:07
 */
@RestController
@RequestMapping("/test")
public class RetryController {
    @Autowired
    private RetryService retryService;

    @GetMapping("/retry")
    public String testRetry() throws Exception {
        return retryService.testRetry();
    }
}
