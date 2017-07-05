/*
 * 项目名：wicbase 	
 * 文件名：IRoleMenuDao.java
 * 包名: com.wicresoft.platform.dao 	
 * 版权： Copyright 2016 Wicresoft Co. Ltd. All Rights Reserved.
 * 描述：角色菜单关系管理数据访问层
 * 修改人：patrick
 * 修改时间：2016年9月14日
 * 修改单号：WS00001
 * 修改内容：〈修改内容〉
 */
package com.patrick.learn.dao;

import java.util.List;

import com.patrick.learn.entity.Role;
import com.patrick.learn.entity.RoleMenu;

/**
 * 
 * 角色菜单关系管理数据访问层
 * 对角色菜单关系进行增、删、改、查等操作
 * @author    patrick
 * @version   1.0.0, 2016年9月14日
 * @see       IRoleMenuDao
 * @since     [产品/模块版本]
 */
public interface IRoleMenuDao {
	/**
	 * 
	 * 插入角色关系信息
	 * 〈功能详细描述〉
	 * @param  record   角色对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insert
	 */
    int insert(RoleMenu record);

    /**
	 * 
	 * 插入角色关系信息
	 * 插入时会判断角色关系属性值是否为空，不为空的插入数据库
	 * @param  record   角色对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insertSelective
	 */
    int insertSelective(RoleMenu record);
    
    /**
   	 * 
   	 *查看角色对应的菜单
   	 * 
   	 * @return List<RoleMenu>
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          selectByCondition
   	 */
    List<RoleMenu> selectByCondition(RoleMenu record);
    
    /**
   	 * 
   	 *删除角色对应的菜单
   	 * 
   	 * @return int
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          deleteRoleMenuByRoleId
   	 */
    int deleteRoleMenuByRoleId(String roleId);
    
    /**
   	 * 
   	 * 查询人员角色信息
   	 * 根据人员ID查询相关联的角色集合信息及其关联的菜单/功能集合信息
   	 * @param  personId   人员ID
   	 * @param  [参数2]   [参数2说明]
   	 * @return List<Role>
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          selectRoleAuthByPerson
   	 */
    List<Role> selectRoleAuthByPerson(String personId);
}