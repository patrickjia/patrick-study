/*
 * 项目名：wicbase 	
 * 文件名：IDepartmentService.java
 * 包名: com.wicresoft.platform.service  	
 * 版权： Copyright 2016 Wicresoft Co. Ltd. All Rights Reserved.
 * 描述：管理组织的基础数据
 * 修改人：patrick
 * 修改时间：2016年9月12日
 * 修改单号：WS00001
 * 修改内容：〈修改内容〉
 */

package com.patrick.learn.service;

import java.util.List;
import java.util.Map;

import com.patrick.learn.entity.Department;


/**
 * 管理组织的基础数据
 * 包括组织的展示、增加、删除、修改以及导出功能
 * @author    patrick
 * @version   1.0.0, 2016年9月12日
 * @see       IDepartmentService
 * @since     [产品/模块版本] 
 */

public interface IDepartmentService{

	/**
	 * 
	 * 根据请求中deptId参数查询得到实例化Department对象
	 * 〈功能详细描述〉
	 * @param  deptId   [参数1说明]
	 * @return Department
	 * @exception/throws [违例类型] [违例说明]
	 * @see          getDepartmentById
	 */
	public Department getDepartmentById(String deptId);
	
	/**
	 * 查询父节点下的子节点
	 * @param superiorDeptId
	 * @return
	 */
	public Department selectBySuperDeptId(String superiorDeptId);

	/**
	 * 
	 * 部门属性信息查询满足条件的部门集合信息
	 * 部门查询条件:path、deptName进行模糊查询
	 * @param  record   部门对象
	 * @param  [参数2]   [参数2说明]
	 * @return List<Department>
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectByCondition
	 */
    List<Department> selectByCondition(Department record);
    
    /**
	 * 
	 * 查询人员所属的组织机构
	 * @param  personId   人员Id
	 * @param  [参数2]   [参数2说明]
	 * @return List<Department>
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectByCondition
	 */
    List<Department> selectByPerson(String personId);
    
	/**
	 * 
	 * 查询分页
	 * 〈功能详细描述〉
	 * @param  map  [参数1说明]
	 * @return Map
	 * @exception/throws [违例类型] [违例说明]
	 * @see          getDepartmentPage
	 */
	public Map<String, Object>  getDepartmentPage(Map<String, String> map);
	
	/**
     * 查询部门树
	 * @param  superDeptId   父节点
	 * @param  [参数2]   [参数2说明]
	 * @return List<Department>
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectDeptTree
     */
    List<Department> selectDeptTree(String superDeptId);
	
	
}
