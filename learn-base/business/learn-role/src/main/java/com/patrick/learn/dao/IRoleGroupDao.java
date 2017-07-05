package com.patrick.learn.dao;

import java.util.List;

import com.patrick.learn.entity.RoleGroup;


/**
 * @author caspar.chen
 * @date 2017-4-19
 */
public interface IRoleGroupDao {

	int insertRoleGroup(RoleGroup record);
	
	int insertRoleGroupRole(RoleGroup record);
	
	int insertRoleGroupPerson(RoleGroup record);
    
	int updateRoleGroup(RoleGroup record);
	
	int deleteRoleGroupRole(RoleGroup record);
	
	int deleteRoleGroupPerson(RoleGroup record);
	
	List<RoleGroup> selectRoleGroup(RoleGroup record);
	
	List<RoleGroup> selectRoleGroupRole(RoleGroup record);
	
	List<RoleGroup> selectRoleGroupPerson(RoleGroup record);
    
}
