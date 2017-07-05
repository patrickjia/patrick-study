package com.patrick.learn.entity;

import java.util.Date;

/**
 *
 * @author caspar.chen
 * @date 2016-11-6
 */
public class BusSystem {
	
	private String busSysId;
	private String busSysCode;
	private String busSysName;
	private String busSysSecret;
	private String busSysUrl;
	private String busSysIcon;
	private String isEnabled;
	private String description;
	private String appcode;
	private String appcodeName;
	private String createPersonId;
	private Date createTime;
	private String updatePersonId;
	private Date updateTime;
	
	public String getAppcodeName() {
		return appcodeName;
	}
	public void setAppcodeName(String appcodeName) {
		this.appcodeName = appcodeName;
	}
	public String getBusSysId() {
		return busSysId;
	}
	public void setBusSysId(String busSysId) {
		this.busSysId = busSysId;
	}
	public String getBusSysCode() {
		return busSysCode;
	}
	public void setBusSysCode(String busSysCode) {
		this.busSysCode = busSysCode;
	}
	public String getBusSysName() {
		return busSysName;
	}
	public void setBusSysName(String busSysName) {
		this.busSysName = busSysName;
	}
	public String getBusSysSecret() {
		return busSysSecret;
	}
	public void setBusSysSecret(String busSysSecret) {
		this.busSysSecret = busSysSecret;
	}
	public String getBusSysUrl() {
		return busSysUrl;
	}
	public void setBusSysUrl(String busSysUrl) {
		this.busSysUrl = busSysUrl;
	}
	public String getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAppcode() {
		return appcode;
	}
	public void setAppcode(String appcode) {
		this.appcode = appcode;
	}
	public String getCreatePersonId() {
		return createPersonId;
	}
	public void setCreatePersonId(String createPersonId) {
		this.createPersonId = createPersonId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUpdatePersonId() {
		return updatePersonId;
	}
	public void setUpdatePersonId(String updatePersonId) {
		this.updatePersonId = updatePersonId;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getBusSysIcon() {
		return busSysIcon;
	}
	public void setBusSysIcon(String busSysIcon) {
		this.busSysIcon = busSysIcon;
	}
	
}
