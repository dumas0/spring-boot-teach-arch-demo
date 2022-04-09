package com.dumas.sbta.schedule.timer;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/09 11:28
 */
public class TimerDemo {
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("执行任务:" + LocalDateTime.now());
            }
        };
        Timer timer = new Timer();
        // timerTask：需要执行的任务
        // delay：延迟时间（以毫秒为单位）
        // period：间隔时间（以毫秒为单位）
        timer.schedule(timerTask, 5000, 3000);
    }
}
