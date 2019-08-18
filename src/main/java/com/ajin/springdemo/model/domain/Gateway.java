package com.ajin.springdemo.model.domain;


import com.ajin.springdemo.common.mybatis.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 网关管理
 * 
 * @author zkhd
 * @email null
 * @date 2019-08-09 16:36:37
 */
@Table(name = "t_gateway")
public class Gateway extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    /**
     * 网关id
     */
    @Id
    private Long gatewayId;
	
	    /**
     * 网关名称
     */
    @Column(name = "gateway_name")
    private String gatewayName;
	
	    /**
     * 心跳包
     */
    @Column(name = "gateway_sign")
    private String gatewaySign;
	
	    /**
     * 网关类型
     */
    @Column(name = "gateway_type")
    private Long gatewayType;
	
	    /**
     * 网关状态
     */
    @Column(name = "gateway_status")
    private Integer gatewayStatus;
	
	    /**
     * 系统编码
     */
    @Column(name = "system_code")
    private String systemCode;
	
	    /**
     * 心跳时间
     */
    @Column(name = "heart_time")
    private Date heartTime;
	
	    /**
     * ip地址
     */
    @Column(name = "ip")
    private String ip;
	
	    /**
     * 端口号
     */
    @Column(name = "port")
    private String port;
	

	/**
	 * 设置：网关id
	 */
	public void setGatewayId(Long gatewayId) {
		this.gatewayId = gatewayId;
	}
	/**
	 * 获取：网关id
	 */
	public Long getGatewayId() {
		return gatewayId;
	}
	/**
	 * 设置：网关名称
	 */
	public void setGatewayName(String gatewayName) {
		this.gatewayName = gatewayName;
	}
	/**
	 * 获取：网关名称
	 */
	public String getGatewayName() {
		return gatewayName;
	}
	/**
	 * 设置：心跳包
	 */
	public void setGatewaySign(String gatewaySign) {
		this.gatewaySign = gatewaySign;
	}
	/**
	 * 获取：心跳包
	 */
	public String getGatewaySign() {
		return gatewaySign;
	}
	/**
	 * 设置：网关类型
	 */
	public void setGatewayType(Long gatewayType) {
		this.gatewayType = gatewayType;
	}
	/**
	 * 获取：网关类型
	 */
	public Long getGatewayType() {
		return gatewayType;
	}
	/**
	 * 设置：网关状态
	 */
	public void setGatewayStatus(Integer gatewayStatus) {
		this.gatewayStatus = gatewayStatus;
	}
	/**
	 * 获取：网关状态
	 */
	public Integer getGatewayStatus() {
		return gatewayStatus;
	}
	/**
	 * 设置：系统编码
	 */
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	/**
	 * 获取：系统编码
	 */
	public String getSystemCode() {
		return systemCode;
	}
	/**
	 * 设置：心跳时间
	 */
	public void setHeartTime(Date heartTime) {
		this.heartTime = heartTime;
	}
	/**
	 * 获取：心跳时间
	 */
	public Date getHeartTime() {
		return heartTime;
	}
	/**
	 * 设置：ip地址
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：ip地址
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * 设置：端口号
	 */
	public void setPort(String port) {
		this.port = port;
	}
	/**
	 * 获取：端口号
	 */
	public String getPort() {
		return port;
	}
}
