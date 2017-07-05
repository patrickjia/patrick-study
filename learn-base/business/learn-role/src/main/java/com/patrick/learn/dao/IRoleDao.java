/*
 * 项目名：wicbase 	
 * 文件名：IRoleDao.java
 * 包名: com.wicresoft.platform.dao 	
 * 版权： Copyright 2016 Wicresoft Co. Ltd. All Rights Reserved.
 * 描述：角色管理数据访问层
 * 修改人：patrick
 * 修改时间：2016年9月14日
 * 修改单号：WS00001
 * 修改内容：〈修改内容〉
 */
package com.patrick.learn.dao;

import java.util.List;

import com.patrick.learn.entity.Menu;
import com.patrick.learn.entity.Role;


/**
 * 
 * 角色管理数据访问层
 * 对角色进行增、删、改、查等操作
 * @author    patrick
 * @version   1.0.0, 2016年9月14日
 * @see       IRoleDao
 * @since     [产品/模块版本]
 */
public interface IRoleDao  {
	/**
	 * 
	 * 根据角色编码删除角色
	 * 〈功能详细描述〉
	 * @param  roleId   角色编码
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see          deleteByPrimaryKey
	 */
    int deleteByPrimaryKey(String roleId);

    /**
	 * 
	 * 插入角色信息
	 * 〈功能详细描述〉
	 * @param  record   角色对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insert
	 */
    int insert(Role record);

    /**
	 * 
	 * 插入角色信息
	 * 插入时会判断角色属性值是否为空，不为空的插入数据库
	 * @param  record   角色对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insertSelective
	 */
    int insertSelective(Role record);

    /**
	 * 
	 * 根据角色编码查询角色信息
	 * 〈功能详细描述〉
	 * @param  roleId   角色编码
	 * @param  [参数2]   [参数2说明]
	 * @return Role
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectByPrimaryKey
	 */
    Role selectByPrimaryKey(String roleId);

    /**
	 * 
	 * 根据条件查询角色信息
	 * 〈功能详细描述〉
	 * @param  record   角色对象
	 * @return List<Role>
	 * @see          selectByCondition
	 */
    List<Role> selectByCondition(Role record);
    /**
   	 * 
   	 * 更新角色信息
   	 * 更新时会判断角色属性值是否为空，不为空的更新数据库
   	 * @param  record   角色对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return int
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          updateByPrimaryKeySelective
   	 */
    int updateByPrimaryKeySelective(Role record);

    /**
   	 * 
   	 * 更新角色信息
   	 * 
   	 * @param  record   角色对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return int
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          updateByPrimaryKey
   	 */
    int updateByPrimaryKey(Role record);
    
    /**
   	 * 
   	 *查看系统的menu和function
   	 * 
   	 * @return List<Menu>
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          selectMenuFunction
   	 */
    List<Menu> selectMenuFunction();
    
    /**
	 * 
	 * 角色属性信息查询满足条件的角色集合信息
	 * 角色查询条件:roleId、appcode进行模糊查询
	 * @param  record   角色对象
	 * @param  [参数2]   [参数2说明]
	 * @return List<Role>
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectRoleByContion
	 */
	 List<Role> selectRoleByContion(Role record);
	 
	 
	 /**
   	 * 
   	 * 查询人员角色信息
   	 * 根据人员ID查询相关联的角色集合信息
   	 * @param  personId   人员ID
   	 * @param  [参数2]   [参数2说明]
   	 * @return List<Role>
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          selectRoleByPerson
   	 */
	 List<Role> selectRoleByPerson(String personId);
	 
	 /**
   	 * 
   	 * 角色属性信息查询满足条件的角色集合信息及其关联的菜单/功能信息
   	 * 角色查询条件:roleId、appcode进行模糊查询
   	 * @param  record   角色对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return List<Role>
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          selectRoleMenuByContion
   	 */
     List<Role> selectRoleMenuByContion(Role record);
     
     /**
      * 根据人员id获取人员所对应的角色Id列表
      * @param personId
      * @return
      */
     List<String> selectRoleIdListByPersonId(String personId);
}