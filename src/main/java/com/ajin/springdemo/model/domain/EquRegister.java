package com.ajin.springdemo.model.domain;


import com.ajin.springdemo.common.mybatis.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * @author zkhd
 * @date 2019-08-09 16:36:37
 */
@Table(name = "t_equ_register")
public class EquRegister extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    /**
     * 
     */
    @Id
    private Long id;
	
	    /**
     * 设备类型
     */
    @Column(name = "dev_type_id")
    private Long devTypeId;
	
	    /**
     * 网关心跳包
     */
    @Column(name = "gateway_sign")
    private String gatewaySign;
	
	    /**
     * 网关品牌
     */
    @Column(name = "gateway_type")
    private Long gatewayType;
	
	    /**
     * 厂商
     */
    @Column(name = "vender")
    private Long vender;
	
	    /**
     * 节点号
     */
    @Column(name = "node_num")
    private String nodeNum;
	
	    /**
     * 系统编码
     */
    @Column(name = "system_code")
    private String systemCode;
	

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
	 * 设置：设备类型
	 */
	public void setDevTypeId(Long devTypeId) {
		this.devTypeId = devTypeId;
	}
	/**
	 * 获取：设备类型
	 */
	public Long getDevTypeId() {
		return devTypeId;
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
	 * 设置：网关品牌
	 */
	public void setGatewayType(Long gatewayType) {
		this.gatewayType = gatewayType;
	}
	/**
	 * 获取：网关品牌
	 */
	public Long getGatewayType() {
		return gatewayType;
	}
	/**
	 * 设置：厂商
	 */
	public void setVender(Long vender) {
		this.vender = vender;
	}
	/**
	 * 获取：厂商
	 */
	public Long getVender() {
		return vender;
	}
	/**
	 * 设置：节点号
	 */
	public void setNodeNum(String nodeNum) {
		this.nodeNum = nodeNum;
	}
	/**
	 * 获取：节点号
	 */
	public String getNodeNum() {
		return nodeNum;
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
}
