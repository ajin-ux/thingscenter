package com.ajin.springdemo.serviceimpl;


import com.ajin.springdemo.common.mybatis.BaseServiceImpl;
import com.ajin.springdemo.mapper.GatewayMapper;
import com.ajin.springdemo.model.domain.Gateway;
import com.ajin.springdemo.service.GatewayService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 网关管理
 *
 * @author zkhd
 * @email null
 * @date 2019-08-11 20:42:41
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GatewayServiceImpl extends BaseServiceImpl<Gateway> implements GatewayService {

    @Resource
    GatewayMapper gatewayMapper;



}