package com.dumas.sbta.job.xxl.job.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author dumas
 * @date 2022/05/27 2:48 PM
 */
@Component
public class DemoJob {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private final AtomicInteger counts = new AtomicInteger();

    @XxlJob("demoJobExecutor")
    public ReturnT<String> demoJobExecutor() throws Exception {
        // 打印日志
        logger.info("[demoJobExecutor][定时第 ({}) 次执行]", counts.incrementAndGet());
        // 返回执行成功
        return ReturnT.SUCCESS;
    }
}
