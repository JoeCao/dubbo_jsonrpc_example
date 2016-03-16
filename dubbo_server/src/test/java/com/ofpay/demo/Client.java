package com.ofpay.demo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.ofpay.demo.api.UserProvider;

/**
 * Created by caozupeng on 15-4-16.
 */
public class Client {
    public static void main(String[] args) {
        try {
            ApplicationConfig applicationConfig = new ApplicationConfig();
            applicationConfig.setName("testApp");
            RegistryConfig registry = new RegistryConfig();
//            registry.setAddress("224.5.6.7:1234");
            registry.setAddress("192.168.59.103:2181");
            ReferenceConfig<UserProvider> reference = new ReferenceConfig<UserProvider>();
            reference.setApplication(applicationConfig);
            reference.setRegistry(registry);
            reference.setCheck(true);
            reference.setInterface(UserProvider.class);
            reference.setVersion("2.0");
            UserProvider userProvider = reference.get();
            for (int i = 0; i < 1000; i++) {
                try {

                    System.out.println(userProvider.getUser("A003"));

                } catch (Exception e) {
                    e.printStackTrace();
                }
                Thread.sleep(5000L);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
