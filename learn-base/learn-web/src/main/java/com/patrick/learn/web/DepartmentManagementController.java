package com.patrick.learn.web;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.patrick.learn.entity.Department;
import com.patrick.learn.entity.Person;
import com.patrick.learn.service.IDepartmentService;
import com.patrick.learn.service.IUserService;

@Controller
@RequestMapping("department")
public class DepartmentManagementController {
	@Autowired
	public IDepartmentService departmentService;
	
	@RequestMapping("viewdepartment")
	public ModelAndView getDepartmentInfo(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String deptId = request.getParameter("deptId");
		Department department = departmentService.getDepartmentById(deptId);
		mav.addObject("department", department);
		mav.setViewName("department/department");
		return mav;
	}
	
	
	@RequestMapping("list")
	public ModelAndView departmentlist(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		
		String deptCode = req.getParameter("deptCode");
		String deptName = req.getParameter("deptName");
		
		System.out.println("编码前:"+deptName);
		try {
			if(null!=deptName){
				deptName = new String(deptName.getBytes("ISO-8859-1"), "UTF-8");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("编码后:"+deptName);
		
		String superiorDeptId = req.getParameter("superiorDeptId");
		String deptType = req.getParameter("deptType");
		String appcode = req.getParameter("appcode");
		String curPage = req.getParameter("curPage");//当前页
		String curRows = req.getParameter("curRows");//每页显示多少条
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("curPage", curPage);
		map.put("curRows", curRows);
		map.put("deptCode", deptCode);
		map.put("deptName", deptName);
		map.put("appcode", appcode);
		map.put("deptType", deptType);
		map.put("superiorDeptId", superiorDeptId);//当前选择的部门编号
//		String tree =  getDepartmentTree(req);
//		mav.addObject("tree",tree);
		Map<String, Object> resultMap = departmentService.getDepartmentPage(map);
		mav.addObject("condition",map);
		mav.addObject("departments", resultMap.get("departments"));
		mav.addObject("page",resultMap.get("page"));
		/*Department dp  = new Department();
		List<Department> departments = departmentService.selectByCondition(dp);
		mav.addObject("departments", departments);*/
		mav.setViewName("department/departmentlist");
		return mav;
	}
	

	
}
