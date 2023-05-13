package com.techsonnet.converter;

import com.techsonnet.pojo.User;
import org.springframework.core.convert.converter.Converter;

public class UserConverter implements Converter<String, User> {

    public User convert(String s) {
        String[] args = s.split("-");
        User user = new User();
        user.setId(Integer.parseInt(args[0]));
        user.setName(args[1]);
        return user;
    }
}
