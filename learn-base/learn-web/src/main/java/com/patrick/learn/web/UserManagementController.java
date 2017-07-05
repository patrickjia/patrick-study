package com.patrick.learn.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.patrick.learn.entity.Person;
import com.patrick.learn.service.IUserService;

@Controller
@RequestMapping("user")
public class UserManagementController {
	@Autowired
	public IUserService userService;
	
	@RequestMapping("viewuser")
	public ModelAndView getUserInfo(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String userId = request.getParameter("personId");
		Person person = userService.selectByUserId(userId);
		mav.addObject("person", person);
		mav.setViewName("user/user");
		return mav;
	}
	
	@RequestMapping("index")
	public ModelAndView mainView(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		Person person = userService.selectByUserId("P20170303004");
		mav.addObject("person", person);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("list")
	public ModelAndView userlist(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		
		String compUserFlag = req.getParameter("compUserFlag");
		String personCode = req.getParameter("personCode");
		String personName = req.getParameter("personName");
		String personType = req.getParameter("personType");
		String appcode = req.getParameter("appcode");
		String deptName = req.getParameter("deptName");
		String deptCode = req.getParameter("deptCode");
		String loginName = req.getParameter("loginName");
		if ("---请选择---".equals(appcode)) {
			appcode = "";
		}
		// 传来的分页信息
		String curPage = req.getParameter("curPage");// 当前页
		String curRows = req.getParameter("curRows");// 每页显示多少条

		Map<String, String> map = new HashMap<String, String>();
		map.put("curPage", curPage);
		map.put("curRows", curRows);
		map.put("personCode", personCode);
		map.put("personName", personName);
		map.put("personType", personType);
		map.put("appcode", appcode);
		map.put("deptCode", deptCode);
		map.put("deptName", deptName);
		map.put("compUserFlag", compUserFlag);
		map.put("loginName", loginName);
		// map.put("superiorDeptId", superiorDeptId);//当前选择的部门编号
//		String tree = getDepartmentTree(req);
//		mav.addObject("tree", tree);
		Map<String, Object> resultMap = userService.getUserPage(map);
		mav.addObject("condition", map);
		mav.addObject("persons", resultMap.get("users"));
		mav.addObject("page", resultMap.get("page"));
		
/*		Person p  = new Person();
		List<Person> persons = userService.selectByCondition(p);
		mav.addObject("persons", persons);*/
		mav.setViewName("user/userlist");
		return mav;
	}
	

	
}
