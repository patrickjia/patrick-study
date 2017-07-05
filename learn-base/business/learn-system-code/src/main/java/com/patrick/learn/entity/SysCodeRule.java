package com.patrick.learn.entity;

/**
 * @author caspar.chen
 * @date 2016-11-24
 */
public class SysCodeRule {

	private String id;
	private String name;
	private String prefix;
	private String suffix;
	private Integer dateRule;
	private String dateSuffix;
	private Integer resetRule;
	private String resetDate;
	private Integer startNum;
	private Integer lengthNum;
	private Integer lengthStatic;
	private Integer currentNum;
	private Integer isEnabled;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public Integer getDateRule() {
		return dateRule;
	}
	public void setDateRule(Integer dateRule) {
		this.dateRule = dateRule;
	}
	public String getDateSuffix() {
		return dateSuffix;
	}
	public void setDateSuffix(String dateSuffix) {
		this.dateSuffix = dateSuffix;
	}
	public Integer getResetRule() {
		return resetRule;
	}
	public void setResetRule(Integer resetRule) {
		this.resetRule = resetRule;
	}
	public String getResetDate() {
		return resetDate;
	}
	public void setResetDate(String resetDate) {
		this.resetDate = resetDate;
	}
	public Integer getStartNum() {
		return startNum;
	}
	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}
	public Integer getLengthNum() {
		return lengthNum;
	}
	public void setLengthNum(Integer lengthNum) {
		this.lengthNum = lengthNum;
	}
	public Integer getLengthStatic() {
		return lengthStatic;
	}
	public void setLengthStatic(Integer lengthStatic) {
		this.lengthStatic = lengthStatic;
	}
	public Integer getCurrentNum() {
		return currentNum;
	}
	public void setCurrentNum(Integer currentNum) {
		this.currentNum = currentNum;
	}
	public Integer getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(Integer isEnabled) {
		this.isEnabled = isEnabled;
	}
}
