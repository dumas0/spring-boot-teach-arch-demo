package com.dumas.sbta.cache.redislock.annotation;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/10 15:20
 */
public interface CacheKeyGenerator {
    /**
     * 获取AOP参数,生成指定缓存Key
     *
     * @param pjp PJP
     * @return 缓存KEY
     */
    String getLockKey(ProceedingJoinPoint pjp);

}
