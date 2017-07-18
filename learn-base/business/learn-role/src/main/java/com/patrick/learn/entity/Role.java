package com.patrick.learn.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Role {
    private String roleId;

    private String roleCode;

    private String roleName;

    private String isEnabled;

    private String description;

    private String appcode;
    private String appcodeName;

    private BigDecimal sortorder;

    private String createPersonId;

    private Date createTime;

    private String updatePersonId;

    private Date updateTime;

    private String rolePersonIds;

    //是否查询角色对于的权限
    private String isAuth;
    
    private List<Menu> menus;
    
    
    public String getAppcodeName() {
		return appcodeName;
	}

	public void setAppcodeName(String appcodeName) {
		this.appcodeName = appcodeName;
	}

	public String getRolePersonIds() {
		return rolePersonIds;
	}

	public void setRolePersonIds(String rolePersonIds) {
		this.rolePersonIds = rolePersonIds;
	}

	public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
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

	public String getIsAuth() {
		return isAuth;
	}

	public void setIsAuth(String isAuth) {
		this.isAuth = isAuth;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
    
}