package com.patrick.learn.entity;

import java.io.Serializable;

/**
 * @author caspar.chen
 * @date 2017-3-20
 */
public class BaseMenu implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String menuId;
	private String menuCode;
	private String menuName;
	private String menuUrl;
	private String partnerId;
	
	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
