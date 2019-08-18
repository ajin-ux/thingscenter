package com.ajin.springdemo.model.vo;

import lombok.Data;

import java.util.List;

@Data
public class DataBoardVo {
    /**
     *时间集合
     */
    private List<String> timeList;
    /**
     *上行数据包集合
     */
    private List<Integer> upFlowList;
    /**
     *下行数据包集合
     */
    private List<Integer>  downFlowList;

}
