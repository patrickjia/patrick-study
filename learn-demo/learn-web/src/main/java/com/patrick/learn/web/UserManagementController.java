package com.patrick.learn.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.patrick.learn.person.entity.Person;
import com.patrick.learn.person.service.IUserService;

@Controller
@RequestMapping("user")
public class UserManagementController {
	@Autowired
	public IUserService userService;
	
	@RequestMapping("viewuser")
	public ModelAndView getUserInfo(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		Person person = userService.selectByUserId("");
		
		mav.setViewName("user/user");
		return mav;
	}
}
