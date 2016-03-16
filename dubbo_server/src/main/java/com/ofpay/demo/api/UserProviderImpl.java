package com.ofpay.demo.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuwen on 15/4/7.
 */
public class UserProviderImpl implements UserProvider {

    public boolean isLimit(Gender gender, String name) {
        return Gender.WOMAN == gender;
    }

    public User getUser(String userId) {
        return new User(userId, "zhangsan", 18);
    }

    public User queryUser(User user) {
        return new User(user.getId(), "hello:" +user.getName(), user.getAge() + 18);
    }

    public Map<String, User> queryAll() {
        Map<String, User> map = new HashMap<String, User>();
        map.put("001", new User("001","zhangsan", 18));
        map.put("002", new User("002","lisi", 20));

        return map;
    }

    @Override
    public User getUser(int userCode) {
        return new User(String.valueOf(userCode), "userCode get", 48);
    }
}
