package com.ajin.springdemo.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName :
 * @Description TODO
 * @Author :
 * @Date :
 * @Version V1.0
 */
@Data
public class CommandLogVo {
    /**
     * 节点号
     */
    private String nodeNum;
    /**
     * 数据包类型
     */
    private String dataType;
    /**
     * 数据包内容
     */
    private String dataContent;
    /**
     * 数据包时间
     */
    private Date dataTime;
}
