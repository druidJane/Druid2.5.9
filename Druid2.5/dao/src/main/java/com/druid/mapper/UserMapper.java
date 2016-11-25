package com.druid.mapper;

import com.druid.model.User;

import java.util.List;

/**
 * Created by druid on 24/11/16.
 */
public interface UserMapper {
    List<User> findUserInfo();
}
