package com.patrick.learn.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Department {
	private String deptId;

	private String deptCode;

	private String deptShortName;

	private String deptName;

	private String deptType;

	private String isEnabled;

	private String personId;

	private String personName;

	private String description;

	private String address;

	private String zip;

	private String ctrPhone;

	private String fax;

	private String path;

	private String superiorDeptId;

	private String supperDeptName;

	private String status;

	private String appcode;

	private String deptPersonIds;

	private BigDecimal sortOrder;

	private String createPersonId;

	private Date createTime;

	private String updatePersonId;

	private Date updateTime;
	
	private String isSubDept;

	public String getIsSubDept() {
		return isSubDept;
	}

	public void setIsSubDept(String isSubDept) {
		this.isSubDept = isSubDept;
	}

	public String getDeptPersonIds() {
		return deptPersonIds;
	}

	public void setDeptPersonIds(String deptPersonIds) {
		this.deptPersonIds = deptPersonIds;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId == null ? null : deptId.trim();
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode == null ? null : deptCode.trim();
	}

	public String getDeptShortName() {
		return deptShortName;
	}

	public void setDeptShortName(String deptShortName) {
		this.deptShortName = deptShortName == null ? null : deptShortName
				.trim();
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName == null ? null : deptName.trim();
	}

	public String getDeptType() {
		return deptType;
	}

	public void setDeptType(String deptType) {
		this.deptType = deptType == null ? null : deptType.trim();
	}

	public String getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled == null ? null : isEnabled.trim();
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId == null ? null : personId.trim();
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

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax == null ? null : fax.trim();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path == null ? null : path.trim();
	}

	public String getSuperiorDeptId() {
		return superiorDeptId;
	}

	public void setSuperiorDeptId(String superiorDeptId) {
		this.superiorDeptId = superiorDeptId == null ? null : superiorDeptId
				.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
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
		this.createPersonId = createPersonId == null ? null : createPersonId
				.trim();
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
		this.updatePersonId = updatePersonId == null ? null : updatePersonId
				.trim();
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getSupperDeptName() {
		return supperDeptName;
	}

	public void setSupperDeptName(String supperDeptName) {
		this.supperDeptName = supperDeptName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
}