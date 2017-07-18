package com.patrick.learn.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class Menu {
	
    private String menuId;

    private String menuCode;

    private String menuName;
    
    private String menuIcon;
    
    private String menuBackUrl;

    private String isEnabled;

    private String isChildNode;

    private String superiorMenuId;

    private String menuUrl;

    private String path;

    private String busSysCode;

    private String description;

    private String appcode;
    
    private String appcodeName;
    
    private BigDecimal sortorder;

    private String createPersonId;

    private Date createTime;

    private String updatePersonId;

    private Date updateTime;

   // @JsonIgnore
    private String personId;
    
    private List<Function> functionList;
    
    private String busSysName;
	private String functionId;
	private String functionCode;
	private String functionName;
    
    public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	public String getMenuBackUrl() {
		return menuBackUrl;
	}

	public void setMenuBackUrl(String menuBackUrl) {
		this.menuBackUrl = menuBackUrl;
	}

	public String getAppcodeName() {
		return appcodeName;
	}

	public void setAppcodeName(String appcodeName) {
		this.appcodeName = appcodeName;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public List<Function> getFunctionList() {
		return functionList;
	}

	public void setFunctionList(List<Function> functionList) {
		this.functionList = functionList;
	}

	public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
    }

    public String getIsChildNode() {
        return isChildNode;
    }

    public void setIsChildNode(String isChildNode) {
        this.isChildNode = isChildNode == null ? null : isChildNode.trim();
    }

    public String getSuperiorMenuId() {
        return superiorMenuId;
    }

    public void setSuperiorMenuId(String superiorMenuId) {
        this.superiorMenuId = superiorMenuId == null ? null : superiorMenuId.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
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

	public String getBusSysName() {
		return busSysName;
	}

	public void setBusSysName(String busSysName) {
		this.busSysName = busSysName;
	}

	public String getFunctionId() {
		return functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}

	public String getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
}