package com.patrick.learn.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SysParam {
    private String sysParamId;

    private String sysParamCode;

    private String sysParamName;

    private String isEnabled;

    private String description;

    private String superiorSysParamId;
    
    private String superiorSysParamName;

    private String path;

    private String busSysCode;

    private String appcode;

    private BigDecimal sortorder;

    private String createPersonId;

    private Date createTime;

    private String updatePersonId;

    private Date updateTime;

    public String getSysParamId() {
        return sysParamId;
    }

    public void setSysParamId(String sysParamId) {
        this.sysParamId = sysParamId == null ? null : sysParamId.trim();
    }

    public String getSysParamCode() {
        return sysParamCode;
    }

    public void setSysParamCode(String sysParamCode) {
        this.sysParamCode = sysParamCode == null ? null : sysParamCode.trim();
    }

    public String getSysParamName() {
        return sysParamName;
    }

    public void setSysParamName(String sysParamName) {
        this.sysParamName = sysParamName == null ? null : sysParamName.trim();
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getSuperiorSysParamId() {
        return superiorSysParamId;
    }

    public void setSuperiorSysParamId(String superiorSysParamId) {
        this.superiorSysParamId = superiorSysParamId == null ? null : superiorSysParamId.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getBusSysCode() {
        return busSysCode;
    }

    public void setBusSysCode(String busSysCode) {
        this.busSysCode = busSysCode == null ? null : busSysCode.trim();
    }

    public String getAppcode() {
        return appcode;
    }

    public void setAppcode(String appcode) {
        this.appcode = appcode == null ? null : appcode.trim();
    }

    public BigDecimal getSortorder() {
        return sortorder;
    }

    public void setSortorder(BigDecimal sortorder) {
        this.sortorder = sortorder;
    }

    public String getCreatePersonId() {
        return createPersonId;
    }

    public void setCreatePersonId(String createPersonId) {
        this.createPersonId = createPersonId == null ? null : createPersonId.trim();
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
        this.updatePersonId = updatePersonId == null ? null : updatePersonId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	public String getSuperiorSysParamName() {
		return superiorSysParamName;
	}

	public void setSuperiorSysParamName(String superiorSysParamName) {
		this.superiorSysParamName = superiorSysParamName;
	}
}