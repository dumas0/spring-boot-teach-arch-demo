package com.dumas.sbta.actuator.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/06 17:35
 */
@Component("my1")
public class MyHealthIndicator implements HealthIndicator{

    private static final String VERSION = "v1.0.0";

    @Override
    public Health health() {
        int code = check();
        if(code != 0){
            Health.down().withDetail("code", code).withDetail("version", VERSION).build();
        }
        return Health.up().withDetail("code", code).withDetail("version", VERSION).up().build();
    }

    private int check(){
        return 0;
    }
}
