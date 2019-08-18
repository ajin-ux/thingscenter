package com.ajin.springdemo.serviceimpl;


import com.ajin.springdemo.common.mybatis.BaseServiceImpl;
import com.ajin.springdemo.mapper.EquRegisterMapper;
import com.ajin.springdemo.model.domain.EquRegister;
import com.ajin.springdemo.service.EquRegisterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 
 *
 * @author zkhd
 * @email null
 * @date 2019-08-11 20:42:41
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EquRegisterServiceImpl extends BaseServiceImpl<EquRegister> implements EquRegisterService {

    @Resource
    EquRegisterMapper equRegisterMapper;


}