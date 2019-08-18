package com.ajin.springdemo.model.vo;


import lombok.Data;

import java.util.List;

@Data
public class PacketMonitoringVo {

    /**
     * 累计数据包总数（上行)
     */
    private long historyUpCount;
    /**
     * 累计数据包总数（下行）
     */
    private long historyDownCount;

    /**
     *   今日数据包总数（上行)
     */
    private long todayUpCount;
    /**
     * 今日数据包总数（下行）
     */
    private long todayDownCount;
    /**
     * 今日最新100条采集数据包
     */
    private List<CommandLogVo> commandLogList;
}
