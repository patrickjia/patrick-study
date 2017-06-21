package com.patrick.learn.person.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Person {
    private String personId;

    private String personCode;

    private String personName;

    private String personType;

    private String isEnabled;

    private String certNo;

    private String sex;

    private String email;

    private String employNo;

    private String rtxCode;

    private String description;

    private String address;

    private String zip;

    private String ctrPhone;

    private String mobilePhone;

    private String fax;

    private String appcode;
    
    private String appcodeName;
    
    private BigDecimal sortOrder;

    private String createPersonId;

    private Date createTime;

    private String updatePersonId;

    private Date updateTime;
    
    private String roleId;
    
    private String roleName;
    
	private String position;
	
	private String positionName;

	private String deptId;
	
    private String deptCode;

    private String deptCodeName;
    
    private String deptId2;
    
    private String deptCode2;
    
    private String deptCode2Name;

    private String contacts;

    private String loginName;

    private String pwd;

    private String deptType;

    private String personalType;//区分企业和个人用户 1：个人用户，2：企业用户

    private String personPhoto;
    
    public String getPersonPhoto() {
		return personPhoto;
	}

	public void setPersonPhoto(String personPhoto) {
		this.personPhoto = personPhoto;
	}

	public String getDeptId2() {
		return deptId2;
	}

	public void setDeptId2(String deptId2) {
		this.deptId2 = deptId2;
	}

	public String getAppcodeName() {
		return appcodeName;
	}

	public void setAppcodeName(String appcodeName) {
		this.appcodeName = appcodeName;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getPersonalType() {
		return personalType;
	}

	public void setPersonalType(String personalType) {
		this.personalType = personalType;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getDeptCodeName() {
		return deptCodeName;
	}

	public void setDeptCodeName(String deptCodeName) {
		this.deptCodeName = deptCodeName;
	}

	public String getDeptCode2Name() {
		return deptCode2Name;
	}

	public void setDeptCode2Name(String deptCode2Name) {
		this.deptCode2Name = deptCode2Name;
	}

	public String getDeptCode2() {
		return deptCode2;
	}

	public void setDeptCode2(String deptCode2) {
		this.deptCode2 = deptCode2;
	}

	public String getDeptType() {
		return deptType;
	}

	public void setDeptType(String deptType) {
		this.deptType = deptType;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode == null ? null : personCode.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType == null ? null : personType.trim();
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEmployNo() {
        return employNo;
    }

    public void setEmployNo(String employNo) {
        this.employNo = employNo == null ? null : employNo.trim();
    }

    public String getRtxCode() {
        return rtxCode;
    }

    public void setRtxCode(String rtxCode) {
        this.rtxCode = rtxCode == null ? null : rtxCode.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getCtrPhone() {
        return ctrPhone;
    }

    public void setCtrPhone(String ctrPhone) {
        this.ctrPhone = ctrPhone == null ? null : ctrPhone.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getAppcode() {
        return appcode;
    }

    public void setAppcode(String appcode) {
        this.appcode = appcode == null ? null : appcode.trim();
    }

    public BigDecimal getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(BigDecimal sortOrder) {
        this.sortOrder = sortOrder;
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

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}