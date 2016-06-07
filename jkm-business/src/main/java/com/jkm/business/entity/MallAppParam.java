package com.jkm.business.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 手机app参数Entity
 * @author ShawZutian
 * @version 2016-04-28
 */
@Entity
@Table(name="mall_app_param")
public class MallAppParam {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private String id;
	private String appVersion;		// 手机app版本
	private String mobileOs;		// 手机操作系统
	private String paramName;		// 参数名称
	private String paramValue;		// 参数值
	private Date updateDate;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	
	//@Length(min=1, max=50, message="手机操作系统长度必须介于 1 和 50 之间")
	public String getMobileOs() {
		return mobileOs;
	}

	public void setMobileOs(String mobileOs) {
		this.mobileOs = mobileOs;
	}
	
	//@Length(min=1, max=128, message="参数名称长度必须介于 1 和 128 之间")
	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	
	//@Length(min=0, max=128, message="参数值长度必须介于 0 和 128 之间")
	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}
	
}