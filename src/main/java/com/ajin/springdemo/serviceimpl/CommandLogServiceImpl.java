package com.ajin.springdemo.serviceimpl;


import com.ajin.springdemo.common.mybatis.BaseServiceImpl;
import com.ajin.springdemo.mapper.CommandLogMapper;
import com.ajin.springdemo.model.domain.CommandLog;
import com.ajin.springdemo.model.vo.PacketMonitoringVo;
import com.ajin.springdemo.service.CommandLogService;
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
public class CommandLogServiceImpl extends BaseServiceImpl<CommandLog> implements CommandLogService {

    @Resource
    CommandLogMapper commandLogMapper;


    @Override
    public PacketMonitoringVo packetMonitoring() {
        PacketMonitoringVo vo = new PacketMonitoringVo();
        //历史上下行数据包数
        String historyCommand = commandLogMapper.selectHistoryCommand();
        vo.setHistoryUpCount(Long.valueOf(historyCommand.split(",")[0]));
        vo.setHistoryDownCount(Long.valueOf(historyCommand.split(",")[1]));
        //今天上下行数据包数
        String todayCommand = commandLogMapper.selectTodayCommand();
        vo.setTodayUpCount(Long.valueOf(todayCommand.split(",")[0]));
        vo.setTodayDownCount(Long.valueOf(todayCommand.split(",")[1]));
        //今日最新100条采集数据包
        vo.setCommandLogList(commandLogMapper.selectTodayCommandLogs());
        return vo;
    }


}