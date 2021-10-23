package com.dhruv.user.service;

import com.dhruv.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //
    List<User> list = Arrays.asList(
            new User(1311l, "Dhruv Prakash", "9538947997"),
            new User(1312l, "Dhruv", "95389479"),
            new User(1313l, "Prakash", "953894")
    );

    @Override
    public User getUser(Long userId) {
        return list.stream().filter(user -> user.getUserId() == (userId)).findAny().orElse(null);
    }


}
