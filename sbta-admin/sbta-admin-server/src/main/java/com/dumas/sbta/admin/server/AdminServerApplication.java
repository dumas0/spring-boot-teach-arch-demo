package com.dumas.sbta.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/08 07:54
 */
@EnableAdminServer
@SpringBootApplication(scanBasePackages = {"com.dumas.sbta"})
public class AdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }
}
