package com.dumas.sbta.exception.handler.controller;

import com.dumas.sbta.exception.handler.exception.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/09 11:41
 */
@RestController
public class ExceptionController {
    @GetMapping("/test3")
    public String test3(Integer num) {
        // TODO 演示需要，实际上参数是否为空通过 @RequestParam(required = true)  就可以控制
        if (num == null) {
            throw new CustomException("num不能为空", 400);
        }
        int i = 10 / num;
        return "result:" + i;
    }
}
