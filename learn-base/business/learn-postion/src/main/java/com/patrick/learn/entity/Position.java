package com.patrick.learn.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Position {
    private String postId;

    private String postCode;

    private String postName;

    private String isEnabled;

    private String description;

    private String appcode;
    
    private String appcodeName;
    
    private BigDecimal sortorder;

    private String createPersonId;
    
    private String positionPersonIds;
    
    private Date createTime;

    private String updatePersonId;

    private Date updateTime;

    public String getAppcodeName() {
		return appcodeName;
	}

	public void setAppcodeName(String appcodeName) {
		this.appcodeName = appcodeName;
	}

	public String getPositionPersonIds() {
		return positionPersonIds;
	}

	public void setPositionPersonIds(String positionPersonIds) {
		this.positionPersonIds = positionPersonIds;
	}

	public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
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
}