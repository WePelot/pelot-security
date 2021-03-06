package com.pelot.security.demo.controller;

import com.pelot.security.demo.dto.User;
import com.pelot.security.demo.dto.UserQueryCondition;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hongcj
 * @version V1.0
 * @since 2017-11-01 10:07
 */
@RestController
public class UserController {

    @GetMapping("/user")
    public List<User> getUser(UserQueryCondition condition) {
        System.out.println(ReflectionToStringBuilder.toString(condition, ToStringStyle.MULTI_LINE_STYLE));
        List<User> list = new ArrayList<>();
        list.add(new User());
        list.add(new User());
        list.add(new User());
        return list;
    }
}
