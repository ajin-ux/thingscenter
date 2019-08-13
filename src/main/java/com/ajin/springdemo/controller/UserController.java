package com.ajin.springdemo.controller;


import com.ajin.springdemo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 分页测试
     * @param pageNum pageNum
     * @param pageSize pageSize
     * @return
     */
    @RequestMapping("/getPageList")
    public PageInfo getPageList(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        return userService.getPageList(pageNum,pageSize);
    }
}
