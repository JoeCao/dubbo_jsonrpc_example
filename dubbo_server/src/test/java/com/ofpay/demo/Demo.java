package com.ofpay.demo;

/**
 * Created by wuwen on 15/4/7.
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        com.alibaba.dubbo.container.Main.main(args);
        synchronized (Demo.class) {
            Demo.class.wait();
        }

    }

}
