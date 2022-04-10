package com.dumas.sbta.localdatetime.controller;

import com.dumas.sbta.localdatetime.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/10 22:52
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public Order query() {
        Order order = new Order();
        order.setPayTime(LocalDateTime.now());
        return order;
    }
}
