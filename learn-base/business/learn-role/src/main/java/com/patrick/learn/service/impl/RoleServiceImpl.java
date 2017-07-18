package com.patrick.learn.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.patrick.learn.common.CommonUtil;
import com.patrick.learn.common.StringUtil;
import com.patrick.learn.common.constant.CommonConstant;
import com.patrick.learn.dao.IRoleDao;
import com.patrick.learn.dao.IRoleGroupDao;
import com.patrick.learn.dao.IRoleMenuDao;
import com.patrick.learn.dao.IUserDao;
import com.patrick.learn.entity.Menu;
import com.patrick.learn.entity.Person;
import com.patrick.learn.entity.Role;
import com.patrick.learn.entity.RoleGroup;
import com.patrick.learn.entity.RoleMenu;
import com.patrick.learn.service.IRoleService;

/**
 * 岗位管理业务实现类
 * 〈功能详细描述〉
 * @author    caspar.chen
 * @version   1.0.0, 2016年11月09日
 * @see       PositionServiceImpl
 * @since     [产品/模块版本] 
 */
@Service
public class RoleServiceImpl   implements IRoleService {

	@Autowired
	private IRoleDao roleDao;
	
	@Autowired
	private IUserDao userDao;

	@Autowired
	private IRoleMenuDao roleMenuDao;
	
	@Autowired
	private IRoleGroupDao roleGroupDao;
	
	
	public Role selectByPrimaryKey(String roleId) {
		return roleDao.selectByPrimaryKey(roleId);
	}

	
	public Map<String, Object> getRolePage(Map<String, String> map) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		Role role = new Role();
		role.setRoleId(map.get("roleId"));
		role.setRoleName(map.get("roleName"));
		role.setRoleCode(map.get("roleCode"));
		role.setAppcode(map.get("appcode"));

		String curPage = (String) map.get("curPage");
		String curRows = (String) map.get("curRows");
		int pageNo = StringUtil.isEmpty(curPage) ? 1 : Integer.parseInt(curPage);
		int pageSize = StringUtil.isEmpty(curRows) ? CommonConstant.PAGE_DEFAULT_ROW : Integer.parseInt(curRows);
		PageHelper.startPage(pageNo, pageSize);
		List<Role> templist = roleDao.selectByCondition(role);
		//用PageInfo对结果进行包装
	    PageInfo<Role> page = new PageInfo<Role>(templist);
		returnMap.put("roles", page.getList());
		returnMap.put("page", page);
		return returnMap;
	}

	
	public Map<String, Object> selectMenuFunction() {
		List<Menu> smf = roleDao.selectMenuFunction();
//		List<BusSystem> sysList = new ArrayList<BusSystem>();
		List<Menu> menList = new ArrayList<Menu>();
		for (int i = 0; i < smf.size(); i++) {
			Menu m =  smf.get(i);
			//系统
//			BusSystem sys = new BusSystem();
//			sys.setBusSysCode(m.getBusSysCode());
//			sys.setBusSysName(m.getBusSysName());
//			if(!isContainsSystem(sysList,sys)){
//				sysList.add(sys);
//			}
			
			//菜单
			Menu men = new Menu();
			men.setBusSysCode(m.getBusSysCode());
			men.setBusSysName(m.getBusSysName());
			men.setMenuId(m.getMenuId());
			men.setMenuCode(m.getMenuCode());
			men.setMenuName(m.getMenuName());
			if(!isContainsMenu(menList,men)){
				menList.add(men);
			}
			
		}
		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("systemList", sysList);
		map.put("menuList", menList);
		map.put("functionList", smf);
		return map;
	}
	
	
	/**
	 * 是否包含菜单
	 * @param list
	 * @param menu
	 * @return
	 */
	public boolean isContainsMenu(List<Menu> list,Menu menu){
		if(CommonUtil.isEmptyList(list)){
			return false;
		}
		for (int i = 0; i < list.size(); i++) {
			Menu m = list.get(i);
			if(m.getMenuId().equals(menu.getMenuId())){
				return true;
			}
		}
		return false ;
	}

	
	public List<RoleMenu> selectByCondition(RoleMenu record) {
		return roleMenuDao.selectByCondition(record);
	}

	
	public Map<String, Object> getRolePersonPage(Map<String, String> map) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		Person person = new Person();
		person.setRoleId(map.get("roleId"));
		person.setPersonCode(map.get("personCode"));
		person.setPersonName(map.get("personName"));
		person.setPersonType(map.get("personType"));
		
		String curPage = (String) map.get("curPage");
		String curRows = (String) map.get("curRows");
		int pageNo = StringUtil.isEmpty(curPage) ? 1 : Integer.parseInt(curPage);
		int pageSize = StringUtil.isEmpty(curRows) ? CommonConstant.PAGE_DEFAULT_ROW : Integer.parseInt(curRows);
		PageHelper.startPage(pageNo, pageSize);
//		List<Person> templist = userDao.selectRolePerson(person);
//		//用PageInfo对结果进行包装
//	    PageInfo<Person> page = new PageInfo<Person>(templist);
//		returnMap.put("rolePersons", page.getList());
//		returnMap.put("page", page);
		return returnMap;
	}

	
	public List<Role> getRole(Role record) {
		return roleDao.selectByCondition(record);
	}


	public List<Role> selectRoleByPerson(String personId) {
		return roleDao.selectRoleByPerson(personId);
	}


	public List<Role> selectRoleAuthByPerson(String personId) {
		return roleMenuDao.selectRoleAuthByPerson(personId);
	}


	public List<Role> getRoleMenuByContion(Role role) {
		return roleDao.selectRoleMenuByContion(role);
	}


	public List<String> selectRoleIdListByPersonId(String personId) {
		return roleDao.selectRoleIdListByPersonId(personId);
	}



	public List<RoleGroup> selectRoleGroup(RoleGroup record) {
		return roleGroupDao.selectRoleGroup(record);
	}


	public List<RoleGroup> selectRoleGroupRole(RoleGroup record) {
		return roleGroupDao.selectRoleGroupRole(record);
	}


	public List<RoleGroup> selectRoleGroupPerson(RoleGroup record) {
		return roleGroupDao.selectRoleGroupPerson(record);
	}



	public RoleGroup selectRoleGroupById(String roleGroupId) {
		// TODO Auto-generated method stub
		return null;
	}


}
