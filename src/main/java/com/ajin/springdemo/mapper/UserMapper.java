package com.ajin.springdemo.mapper;

import com.ajin.springdemo.domain.User;

import java.util.List;

public interface UserMapper {


    List<User> getPageList();
}
