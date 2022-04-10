package com.dumas.sbta.retry.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

/**
 * @author dumas
 * @desc TODO 说明：@Retryable配置元数据情况：
 * value ：针对指定抛出的异常类型，进行重试，这里指定的是Exception
 * maxAttempts ：配置最大重试次数，这里配置为3次（包含第一次和最后一次）
 * delay： 第一次重试延迟间隔，这里配置的是2s
 * multiplier ：每次重试时间间隔是前一次几倍，这里是1.5倍
 * @date 2022/04/10 22:05
 */
@Service
public class RetryServiceImpl implements RetryService {

    @Retryable(value = Exception.class, maxAttempts = 3, backoff = @Backoff(delay = 2000, multiplier = 1.5))
    @Override
    public String testRetry() throws Exception {
        System.out.println("开始执行代码：" + LocalTime.now());
        int code = 0;
        // 模拟一直失败
        if (code == 0) {
            // 这里可以使自定义异常，@Retryable中value需与其一致
            throw new Exception("代码执行异常");
        }
        System.out.println("代码执行成功");
        return "success";
    }

    /**
     * 最终重试失败处理
     *
     * @param e
     * @return
     */
    @Recover
    public String recover(Exception e) {
        System.out.println("代码执行重试后依旧失败");
        return "fail";
    }
}
