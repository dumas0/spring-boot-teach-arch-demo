package com.dumas.sbta.job.quartz.memory.job;

import com.dumas.sbta.job.quartz.memory.service.DemoService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author dumas
 * @date 2022/05/27 2:05 PM
 */
public class Demo01Job extends QuartzJobBean {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private final AtomicInteger counts = new AtomicInteger();

    @Autowired
    private DemoService demoService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("[executeInternal][定时第（{}）次执行， demoService 为 （{}）]", counts.incrementAndGet(), demoService);
    }
}
