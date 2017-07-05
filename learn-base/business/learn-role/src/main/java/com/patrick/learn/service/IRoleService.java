package com.patrick.learn.service;

import java.util.List;
import java.util.Map;

import com.patrick.learn.entity.Role;
import com.patrick.learn.entity.RoleGroup;
import com.patrick.learn.entity.RoleMenu;


/**
 * 管理角色的基础数据 包括角色的展示、增加、删除、修改以及导出功能
 * 
 * @author caspar.chen
 * @version 1.0.0, 2016年11月10日
 * @see IPositionService
 * @since [产品/模块版本]
 */
public interface IRoleService  {


	/**
	 * 
	 * 根据角色编码查询角色信息 〈功能详细描述〉
	 * 
	 * @param roleId
	 *            角色编码
	 * @param [参数2] [参数2说明]
	 * @return Role
	 * @exception/throws [违例类型] [违例说明]
	 * @see selectByPrimaryKey
	 */
	Role selectByPrimaryKey(String roleId);


	/**
	 * 
	 * 查询分页 〈功能详细描述〉
	 * 
	 * @param map
	 *            [参数1说明]
	 * @return Map
	 * @exception/throws [违例类型] [违例说明]
	 * @see getRolePage
	 */
	Map<String, Object> getRolePage(Map<String, String> map);

	/**
	 * 查询role列表
	 * 
	 * @param [参数1] [参数1说明]
	 * @param [参数2] [参数2说明]
	 * @return [返回类型说明]
	 * @exception/throws [违例类型] [违例说明]
	 * @see [类、类#方法、类#成员]
	 */
	List<Role> getRole(Role record);

	/**
	 * 
	 * 查看系统的menu和function
	 * 
	 * @return Map<String, Object>
	 * @exception/throws [违例类型] [违例说明]
	 * @see selectMenuFunction
	 */
	Map<String, Object> selectMenuFunction();

	
	/**
	 * 
	 * 查看角色对应的菜单
	 * 
	 * @return List<RoleMenu>
	 * @exception/throws [违例类型] [违例说明]
	 * @see selectByCondition
	 */
	List<RoleMenu> selectByCondition(RoleMenu record);

	

	/**
	 * 
	 * 查看角色人员 〈功能详细描述〉
	 * 
	 * @param map
	 *            [参数1说明]
	 * @return Map
	 * @exception/throws [违例类型] [违例说明]
	 * @see getRolePersonPage
	 */
	Map<String, Object> getRolePersonPage(Map<String, String> map);
	
	
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
   	 * 查询人员角色信息
   	 * 根据人员ID查询相关联的角色集合信息及其关联的菜单/功能集合信息
   	 * @param  personId   人员ID
   	 * @param  [参数2]   [参数2说明]
   	 * @return List<Role>
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          selectRoleAuthByPerson
   	 */
    List<Role> selectRoleAuthByPerson(String personId);
    
    
    /**
	 * 
	 * 根据条件查询角色信息及其关联的菜单/功能信息
	 * 〈功能详细描述〉
	 * @param  role   角色对象
	 * @return List<Role>
	 * @exception/throws [违例类型] [违例说明]
	 * @see          getRoleMenuByContion
	 */
	List<Role> getRoleMenuByContion(Role role);
	
	/**
     * 根据人员id获取人员所对应的角色Id列表
     * @param personId
     * @return
     */
    List<String> selectRoleIdListByPersonId(String personId);
    
    RoleGroup selectRoleGroupById(String roleGroupId);
    
	List<RoleGroup> selectRoleGroup(RoleGroup record);
	
	List<RoleGroup> selectRoleGroupRole(RoleGroup record);
	
	List<RoleGroup> selectRoleGroupPerson(RoleGroup record);
    
	
}
