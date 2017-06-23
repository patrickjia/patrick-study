package com.patrick.learn.web;

import java.util.List;

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
	public ModelAndView userlist(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		Person p  = new Person();
		List<Person> persons = userService.selectByCondition(p);
		mav.addObject("persons", persons);
		mav.setViewName("user/userlist");
		return mav;
	}
	

	
}
