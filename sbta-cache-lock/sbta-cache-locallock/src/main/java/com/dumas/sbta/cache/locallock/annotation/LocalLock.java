package com.dumas.sbta.cache.locallock.annotation;

import java.lang.annotation.*;

/**
 * 锁注解
 * @author dumas
 * @desc TODO
 * @date 2022/04/10 14:54
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LocalLock {
    String key() default "";

    /**
     * 过期时间 TODO 由于用的 guava 暂时就忽略这属性吧 集成 redis 需要用到
     */
    int expire() default 5;
}
