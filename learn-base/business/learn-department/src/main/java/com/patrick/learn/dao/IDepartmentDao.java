/*
 * 项目名：wicbase 	
 * 文件名：IDepartmentDao.java
 * 包名: com.wicresoft.platform.dao 	
 * 版权： Copyright 2016 Wicresoft Co. Ltd. All Rights Reserved.
 * 描述： 部门管理数据访问层
 * 修改人：patrick
 * 修改时间：2016年9月14日
 * 修改单号：WS00001
 * 修改内容：〈修改内容〉
 */
package com.patrick.learn.dao;

import java.util.List;

import com.patrick.learn.entity.Department;


/**
 * 
 * 部门管理数据访问层
 * 对部门进行增、删、改、查等操作
 * @author    patrick
 * @version   1.0.0, 2016年9月14日
 * @see       IDepartmentDao
 * @since     [产品/模块版本]
 */
public interface IDepartmentDao {
    
	/**
	 * 
	 * 根据部门编码删除部门
	 * 〈功能详细描述〉
	 * @param  deptId   部门编码
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see          deleteByPrimaryKey
	 */
	int deleteByPrimaryKey(String deptId);

	/**
	 * 
	 * 插入部门信息
	 * 〈功能详细描述〉
	 * @param  record   部门对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insert
	 */
    int insert(Department record);

    /**
	 * 
	 * 插入部门信息
	 * 插入时会判断部门属性值是否为空，不为空的插入数据库
	 * @param  record   部门对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insertSelective
	 */
    int insertSelective(Department record);

    /**
	 * 
	 * 根据部门编码查询部门信息
	 * 〈功能详细描述〉
	 * @param  deptId   部门编码
	 * @param  [参数2]   [参数2说明]
	 * @return Department
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectByPrimaryKey
	 */
    Department selectByPrimaryKey(String deptId);
    
    /**
   	 * 
   	 * 更新部门信息
   	 * 更新时会判断部门属性值是否为空，不为空的更新数据库
   	 * @param  record   部门对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return int
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          updateByPrimaryKeySelective
   	 */
    int updateByPrimaryKeySelective(Department record);

    /**
   	 * 
   	 * 更新部门信息
   	 * 
   	 * @param  record   部门对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return int
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          updateByPrimaryKey
   	 */
    int updateByPrimaryKey(Department record);
    
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
     * 查询部门树
	 * @param  superDeptId   父节点
	 * @param  [参数2]   [参数2说明]
	 * @return List<Department>
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectDeptTree
     */
    List<Department> selectDeptTree(String superDeptId);
    
    /**
	 * 
	 * 根据上级部门编码查询部门信息
	 * 〈功能详细描述〉
	 * @param  deptId   部门编码
	 * @param  [参数2]   [参数2说明]
	 * @return Department
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectByPrimaryKey
	 */
    Department selectBySuperDeptId(String deptId);
    
}