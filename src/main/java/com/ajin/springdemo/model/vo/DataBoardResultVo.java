package com.ajin.springdemo.model.vo;

import lombok.Data;

@Data
public class DataBoardResultVo {
    /**
     *时间
     */
    private String time;
    /**
     * 1上行 2 下行
     */
    private Integer type;
    /**
     *下行数据包
     */
    private Integer  flow;

}
