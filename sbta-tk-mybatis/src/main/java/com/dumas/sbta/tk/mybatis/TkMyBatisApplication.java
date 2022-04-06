package com.dumas.sbta.tk.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/05 14:39
 */
@SpringBootApplication
//@ComponentScan(basePackages = {"com.dumas.sbta.tk.mybatis.*"})
public class TkMyBatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(TkMyBatisApplication.class, args);
    }
}

