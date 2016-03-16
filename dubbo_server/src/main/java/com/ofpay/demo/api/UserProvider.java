package com.ofpay.demo.api;

import java.util.Map;

/**
 * Created by wuwen on 15/4/7.
 */
public interface UserProvider {

    boolean isLimit(Gender gender, String name);

    User getUser(String userId);

    User getUser(int usercode);

    User queryUser(User user);

    Map<String, User> queryAll();
}
