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

import com.patrick.learn.entity.Person;
import com.patrick.learn.entity.Role;
import com.patrick.learn.entity.RoleMenu;
import com.patrick.learn.service.IRoleService;
import com.patrick.learn.service.IUserService;

@Controller
@RequestMapping("role")
public class RoleManagementController {
	@Autowired
	public IRoleService roleService;
	
	@RequestMapping("viewrole")
	public ModelAndView getRoleInfo(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String roleId = request.getParameter("roleId");
		Role role = roleService.selectByPrimaryKey(roleId);
		mav.addObject("role", role);
		mav.setViewName("role/role");
		return mav;
	}
	
	
	@RequestMapping("list")
	public ModelAndView rolelist(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String roleName = request.getParameter("roleName");
		
		System.out.println("编码前:"+roleName);
		try {
			if(null!=roleName){
				roleName = new String(roleName.getBytes("ISO-8859-1"), "UTF-8");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("编码后:"+roleName);
		
		
		String roleCode = request.getParameter("roleCode");
		String appcode = request.getParameter("appcode");
		//传来的分页信息
		String curPage = request.getParameter("curPage");//当前页
		String curRows = request.getParameter("curRows");//每页显示多少条
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("curPage", curPage);
		map.put("curRows", curRows);
		map.put("roleName", roleName);
		map.put("roleCode", roleCode);
		map.put("appcode", appcode);
		Map<String, Object> resultMap = roleService.getRolePage(map);
		mav.addObject("condition",map);
		mav.addObject("roles", resultMap.get("roles"));
		mav.addObject("page",resultMap.get("page"));
		
		/*Role role  = new Role();
		List<Role> roles = roleService.getRole(role);
		mav.addObject("roles", roles);*/
		mav.setViewName("role/rolelist");
		return mav;
	}
	

	
}
