/*
 * 项目名：wicbase 	
 * 文件名：DepartmentServiceImpl.java
 * 包名: com.wicresoft.platform.service.impl  	
 * 版权： Copyright 2016 Wicresoft Co. Ltd. All Rights Reserved.
 * 描述：部门管理业务实现类
 * 修改人：patrick
 * 修改时间：2016年9月12日
 * 修改单号：WS00001
 * 修改内容：〈修改内容〉
 */

package com.patrick.learn.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.patrick.learn.common.StringUtil;
import com.patrick.learn.common.constant.CommonConstant;
import com.patrick.learn.dao.IFunctionDao;
import com.patrick.learn.dao.IMenuDao;
import com.patrick.learn.entity.Function;
import com.patrick.learn.entity.Menu;
import com.patrick.learn.service.IMenusService;

/**
 * 部门管理业务实现类 〈功能详细描述〉
 * 
 * @author patrick
 * @version 1.0.0, 2016年9月12日
 * @see MenusServiceImpl
 * @since [产品/模块版本]
 */
@Service
public class MenusServiceImpl implements IMenusService {

	@Autowired
	private IMenuDao menuDao;
	
	
	@Autowired
	private IFunctionDao functionDao;


	public List<Menu> selectMenusTree(Menu menu) {
		return menuDao.selectMenuTree(menu);
	}

	

	public Map<String, Object> getMenuPage(Map<String, String> map) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		Menu menu = new Menu();
		menu.setMenuName(map.get("menuName"));
		menu.setMenuCode(map.get("menuCode"));
		menu.setIsEnabled(map.get("menuStatus"));
		menu.setBusSysCode(map.get("busSysCode"));
		String curPage = (String) map.get("curPage");
		String curRows = (String) map.get("curRows");
		int pageNo = StringUtil.isEmpty(curPage) ? 1 : Integer.parseInt(curPage);
		int pageSize = StringUtil.isEmpty(curRows) ? CommonConstant.PAGE_DEFAULT_ROW : Integer.parseInt(curRows);
		PageHelper.startPage(pageNo, pageSize);
		List<Menu> templist = menuDao.selectByCondition(menu);
		//用PageInfo对结果进行包装
	    PageInfo<Menu> page = new PageInfo<Menu>(templist);
		returnMap.put("menus", page.getList());
		returnMap.put("page", page);
		return returnMap;
	}

	

	public List<Menu> checkMenuCode(String menuCode) {
		return menuDao.selectByMenuCode(menuCode);
	}

	public List<Function> checkFunctionCode(String menuId,List<String> funcCode) {
		Map<String, Object> params = new HashMap<String, Object>(2);
        params.put("menuId", menuId);
        params.put("funcCode", funcCode);
		return functionDao.checkFunctionCode(params);
	}

	public Menu selectByMenuCode(String menuCode) {
		List<Menu> list = menuDao.selectByMenuCode(menuCode);
		if(list.size()>0){
			List<Function> listF = functionDao.selectByMenuId(list.get(0).getMenuId());
			list.get(0).setFunctionList(listF);
			return list.get(0);
		}else{
			return null;
		}
	}

	public Menu selectByMenuId(String superiorMenuId) {
		return menuDao.selectByPrimaryKey(superiorMenuId);
	}

	public boolean deleteMenu(String menuId) {
		return menuDao.deleteByPrimaryKey(menuId)!= 0 ? true : false;
	}

	public List<Menu> selectByCondition(Menu menu) {
		return menuDao.selectByCondition(menu);
	}

	public List<Function> selectFunctionByMenuId(String menuId) {
		return functionDao.selectByMenuId(menuId);
	}

	
}
