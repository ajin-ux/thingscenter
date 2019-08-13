package com.ajin.springdemo.service;


import com.github.pagehelper.PageInfo;

public interface UserService {

    PageInfo getPageList(Integer pageNum, Integer pageSize);


}
