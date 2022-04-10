package com.dumas.sbta.cache.redislock.annotation;

import java.lang.annotation.*;

/**
 * @author dumas
 * @desc TODO 锁的参数
 * @date 2022/04/10 15:19
 */
@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface CacheParam {
    /**
     * 字段名称
     *
     * @return String
     */
    String name() default "";
}
