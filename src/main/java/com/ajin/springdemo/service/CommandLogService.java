package com.ajin.springdemo.service;


import com.ajin.springdemo.common.mybatis.BaseService;
import com.ajin.springdemo.model.domain.CommandLog;
import com.ajin.springdemo.model.vo.PacketMonitoringVo;


/**
 * 
 *
 * @author zkhd
 * @date 2019-08-11 20:42:41
 */
public interface CommandLogService extends BaseService<CommandLog> {


    PacketMonitoringVo packetMonitoring();

//    DataBoardVo dataBoard(TimeParamVo timeParamVo);
}