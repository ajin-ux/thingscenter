package com.ajin.springdemo.model.domain;


import com.ajin.springdemo.common.mybatis.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zkhd
 * @date 2019-08-09 16:36:37
 */
@Table(name = "t_command_log")
public class CommandLog extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    /**
     * 
     */
    @Id
    private Long id;
	
	    /**
     * 设备节点号
     */
    @Column(name = "node_num")
    private String nodeNum;
	
	    /**
     * 发送的指令
     */
    @Column(name = "send_command")
    private String sendCommand;
	
	    /**
     * 指令类型id
     */
    @Column(name = "task_type_id")
    private Long taskTypeId;
	
	    /**
     * 具体操作id
     */
    @Column(name = "task_info_id")
    private Long taskInfoId;
	
	    /**
     * 返回业务编码
     */
    @Column(name = "bussiness_code")
    private String bussinessCode;
	
	    /**
     * 返回值（key:value,key:value）
     */
    @Column(name = "data")
    private String data;
	
	    /**
     * 系统编号
     */
    @Column(name = "system_code")
    private String systemCode;
	
	    /**
     * 网关品牌id
     */
    @Column(name = "gateway_type_id")
    private Long gatewayTypeId;
	
	    /**
     * 网关心跳包
     */
    @Column(name = "gateway_sign")
    private String gatewaySign;
	
	    /**
     * 厂家id
     */
    @Column(name = "vender_id")
    private Long venderId;
	
	    /**
     * 发送时间
     */
    @Column(name = "send_time")
    private Date sendTime;
	
	    /**
     * 回值时间
     */
    @Column(name = "return_time")
    private Date returnTime;
	
	    /**
     * 是否回值（1:是，2:否）
     */
    @Column(name = "is_return")
    private Integer isReturn;
	
	    /**
     * 返回的指令
     */
    @Column(name = "return_command")
    private String returnCommand;
	
	    /**
     * 指令状态编码
     */
    @Column(name = "task_state_code")
    private String taskStateCode;
	
	    /**
     * 设备类型id
     */
    @Column(name = "dev_type_id")
    private Long devTypeId;
	
	    /**
     * 调度类型id
     */
    @Column(name = "structure")
    private Long structure;
	

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：设备节点号
	 */
	public void setNodeNum(String nodeNum) {
		this.nodeNum = nodeNum;
	}
	/**
	 * 获取：设备节点号
	 */
	public String getNodeNum() {
		return nodeNum;
	}
	/**
	 * 设置：发送的指令
	 */
	public void setSendCommand(String sendCommand) {
		this.sendCommand = sendCommand;
	}
	/**
	 * 获取：发送的指令
	 */
	public String getSendCommand() {
		return sendCommand;
	}
	/**
	 * 设置：指令类型id
	 */
	public void setTaskTypeId(Long taskTypeId) {
		this.taskTypeId = taskTypeId;
	}
	/**
	 * 获取：指令类型id
	 */
	public Long getTaskTypeId() {
		return taskTypeId;
	}
	/**
	 * 设置：具体操作id
	 */
	public void setTaskInfoId(Long taskInfoId) {
		this.taskInfoId = taskInfoId;
	}
	/**
	 * 获取：具体操作id
	 */
	public Long getTaskInfoId() {
		return taskInfoId;
	}
	/**
	 * 设置：返回业务编码
	 */
	public void setBussinessCode(String bussinessCode) {
		this.bussinessCode = bussinessCode;
	}
	/**
	 * 获取：返回业务编码
	 */
	public String getBussinessCode() {
		return bussinessCode;
	}
	/**
	 * 设置：返回值（key:value,key:value）
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * 获取：返回值（key:value,key:value）
	 */
	public String getData() {
		return data;
	}
	/**
	 * 设置：系统编号
	 */
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	/**
	 * 获取：系统编号
	 */
	public String getSystemCode() {
		return systemCode;
	}
	/**
	 * 设置：网关品牌id
	 */
	public void setGatewayTypeId(Long gatewayTypeId) {
		this.gatewayTypeId = gatewayTypeId;
	}
	/**
	 * 获取：网关品牌id
	 */
	public Long getGatewayTypeId() {
		return gatewayTypeId;
	}
	/**
	 * 设置：网关心跳包
	 */
	public void setGatewaySign(String gatewaySign) {
		this.gatewaySign = gatewaySign;
	}
	/**
	 * 获取：网关心跳包
	 */
	public String getGatewaySign() {
		return gatewaySign;
	}
	/**
	 * 设置：厂家id
	 */
	public void setVenderId(Long venderId) {
		this.venderId = venderId;
	}
	/**
	 * 获取：厂家id
	 */
	public Long getVenderId() {
		return venderId;
	}
	/**
	 * 设置：发送时间
	 */
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	/**
	 * 获取：发送时间
	 */
	public Date getSendTime() {
		return sendTime;
	}
	/**
	 * 设置：回值时间
	 */
	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}
	/**
	 * 获取：回值时间
	 */
	public Date getReturnTime() {
		return returnTime;
	}
	/**
	 * 设置：是否回值（1:是，2:否）
	 */
	public void setIsReturn(Integer isReturn) {
		this.isReturn = isReturn;
	}
	/**
	 * 获取：是否回值（1:是，2:否）
	 */
	public Integer getIsReturn() {
		return isReturn;
	}
	/**
	 * 设置：返回的指令
	 */
	public void setReturnCommand(String returnCommand) {
		this.returnCommand = returnCommand;
	}
	/**
	 * 获取：返回的指令
	 */
	public String getReturnCommand() {
		return returnCommand;
	}
	/**
	 * 设置：指令状态编码
	 */
	public void setTaskStateCode(String taskStateCode) {
		this.taskStateCode = taskStateCode;
	}
	/**
	 * 获取：指令状态编码
	 */
	public String getTaskStateCode() {
		return taskStateCode;
	}
	/**
	 * 设置：设备类型id
	 */
	public void setDevTypeId(Long devTypeId) {
		this.devTypeId = devTypeId;
	}
	/**
	 * 获取：设备类型id
	 */
	public Long getDevTypeId() {
		return devTypeId;
	}
	/**
	 * 设置：调度类型id
	 */
	public void setStructure(Long structure) {
		this.structure = structure;
	}
	/**
	 * 获取：调度类型id
	 */
	public Long getStructure() {
		return structure;
	}
}
