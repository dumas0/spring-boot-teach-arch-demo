package com.dumas.sbta.multi.thread.communication;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/06/30 17:43
 */
public class LockSupportTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 线程B
        final Thread threadB = new Thread(() -> {
            if (list.size() != 5) {
                LockSupport.park();
            }
            System.out.println("线程B收到通知，开始执行自己的业务...");
        });
        // 线程A
        Thread threadA = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                list.add("abc");
                System.out.println("线程A添加元素，此时的list的size为： " + list.size());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (list.size() == 5) {
                    LockSupport.unpark(threadB);
                }
            }
        });

        // 需要先启动线程B
        threadB.start();
        // 再启动线程A
        threadA.start();
    }
}
