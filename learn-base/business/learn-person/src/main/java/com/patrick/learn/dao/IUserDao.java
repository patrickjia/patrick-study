package com.patrick.learn.dao;

import java.util.List;

import com.patrick.learn.entity.BaseMenu;
import com.patrick.learn.entity.Person;



/**
 * 
 * 用户数据访问层
 * 对业务系统进行增、删、改、查等操作
 */
public interface IUserDao {

	/**
	 * 根据条件查询用户信息
	 * @param person 对象
	 * @return 集合
	 **/
	List<Person> selectByCondition(Person person);

	int insertUser(Person person);

	int insertUserDept(Person person);

	int insertUserRole(Person person);

	int insertUserPosition(Person person);

	int insertUserDept2(Person person);

	List<Person> selectByUserId(String personId);

	int updateByPrimaryKey(Person person);
	
	int updateByPrimaryKeyPerson(Person person);

	int deleteUserDept(Person person);

	int deleteUserPosition(Person person);

	int deleteUserRole(Person person);

	int delteUserByPrimaryKey(Person person);

	List<Person> selectCompUserByCondition(Person person);

	int delteUserCompanyByPrimaryKey(String userId);

	List<Person> getPostionPersons(Person p);
	
	List<Person> getRolePersons(Person p);

	List<Person> getPersonsByRoleId(Person p);

	void deleteUserRoleByRoleId(String roleId);
	
	int insertUserCompany(Person person);

	int updateByPrimaryKeyPersonCompany(Person person);

	Person selectByUserIdCompany(String personId);

	int insertUserPersonNormal(Person person);

    Person login(Person person);

	List<Person> getPersonsByPositionId(Person p);

	List<Person> getPersonsByDeptId(Person p);
	
	List<Person> getAllPersonsBySuperDeptCode(Person p);
	
	int deleteUserPositionByPositionId(String position);

	int deleteUserPositionByDeptId(String deptCode);
	/**
     * 查看角色人员
     * @param record
     * @return
     */
    List<Person> selectRolePerson(Person record);
    
    /**
     * 查询没有主部门的人员
     */
    List<Person> getDepartmentPersonMultiselect(Person record);
    
    /**
     * 查询部门下面的员工
     */
    List<Person> getDepartmentPerson(String deptId);
    
    /**
     * 查询人员在基础平台的菜单
     * @param personId
     * @return
     */
    List<BaseMenu> getBaseMenuByPersonId(String personId);
    
    /**
     * 认证rtxcode
     * @param person
     * @return
     */
    Integer authRtxCode(Person person);
}
