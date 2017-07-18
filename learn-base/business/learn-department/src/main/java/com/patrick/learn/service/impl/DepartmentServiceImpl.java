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
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.patrick.learn.common.StringUtil;
import com.patrick.learn.common.constant.CommonConstant;
import com.patrick.learn.dao.IDepartmentDao;
import com.patrick.learn.entity.Department;
import com.patrick.learn.service.IDepartmentService;

/**
 * 部门管理业务实现类 〈功能详细描述〉
 * 
 * @author patrick
 * @version 1.0.0, 2016年9月12日
 * @see DepartmentServiceImpl
 * @since [产品/模块版本]
 */
@Service
public class DepartmentServiceImpl  implements IDepartmentService {

	@Autowired
	private IDepartmentDao departmentDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wicresoft.platform.service.IDepartmentService#getDepartmentById(java
	 * .lang.String)
	 */
	public Department getDepartmentById(String deptId) {

		return departmentDao.selectByPrimaryKey(deptId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wicresoft.platform.service.IDepartmentService#getDepartmentPage(java
	 * .util.Map)
	 */
	public Map<String, Object> getDepartmentPage(Map<String, String> map) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		Department department = new Department();
		department.setDeptCode(map.get("deptCode"));
		department.setDeptName(map.get("deptName"));
		department.setDeptType(map.get("deptType"));
		department.setAppcode(map.get("appcode"));
		department.setSuperiorDeptId(map.get("superiorDeptId"));
		String curPage = (String) map.get("curPage");
		String curRows = (String) map.get("curRows");
		int pageNo = StringUtil.isEmpty(curPage) ? 1 : Integer
				.parseInt(curPage);
		int pageSize = StringUtil.isEmpty(curRows) ? CommonConstant.PAGE_DEFAULT_ROW
				: Integer.parseInt(curRows);
		PageHelper.startPage(pageNo, pageSize);
		List<Department> templist = departmentDao.selectByCondition(department);
		// 用PageInfo对结果进行包装
		PageInfo<Department> page = new PageInfo<Department>(templist);
		returnMap.put("departments", page.getList());
		returnMap.put("page", page);
		return returnMap;
	}

	List<Department> removeObjFromList(List<Department> templist,
			Department dept) {
		if (null != templist) {
			for (Iterator<Department> iterator = templist.iterator(); iterator
					.hasNext();) {
				Department department = iterator.next();
				if (department.getDeptId().equals(dept.getDeptId())) {
					templist.remove(department);
					break;
				}

			}
		}
		return templist;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wicresoft.platform.service.IDepartmentService#getDepartmentByTree
	 * (com.wicresoft.platform.pojo.Department)
	 */
	public List<Department> selectDeptTree(String superDeptId) {
		return departmentDao.selectDeptTree(superDeptId);
	}

	
	public Department selectBySuperDeptId(String superiorDeptId) {
		return departmentDao.selectBySuperDeptId(superiorDeptId);

	}

	public List<Department> selectByCondition(Department record) {
		return departmentDao.selectByCondition(record);
	}

	public List<Department> selectByPerson(String personId) {
		return departmentDao.selectByPerson(personId);
	}

}
