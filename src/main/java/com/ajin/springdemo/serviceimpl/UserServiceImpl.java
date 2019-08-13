package com.ajin.springdemo.serviceimpl;

import com.ajin.springdemo.domain.User;
import com.ajin.springdemo.mapper.UserMapper;
import com.ajin.springdemo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public PageInfo getPageList(Integer pageNum, Integer pageSize) {
        if(pageNum!=null&&pageSize!=null){
            PageHelper.startPage(pageNum,pageSize);
        }
        List<User> list = userMapper.getPageList();
        return new PageInfo<>(list);
    }
}
