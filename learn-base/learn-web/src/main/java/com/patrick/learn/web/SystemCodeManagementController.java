package com.patrick.learn.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.patrick.learn.entity.Person;
import com.patrick.learn.entity.SysCodeRule;
import com.patrick.learn.service.ISysCodeRuleService;
import com.patrick.learn.service.IUserService;

@Controller
@RequestMapping("systemcode")
public class SystemCodeManagementController {
	@Autowired
	public ISysCodeRuleService sysCodeRuleService;
	
	@RequestMapping("viewsystemcode")
	public ModelAndView getSystemcodeInfo(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String sysCodeRuleId = request.getParameter("sysCodeRuleId");
		SysCodeRule syscode = sysCodeRuleService.selectByPrimaryKey(sysCodeRuleId);
		mav.addObject("syscode", syscode);
		mav.setViewName("systemcode/systemcode");
		return mav;
	}
	
	
	
	@RequestMapping("list")
	public ModelAndView systemcodelist(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		SysCodeRule p  = new SysCodeRule();
		List<SysCodeRule> syscodes = sysCodeRuleService.selectByCondition(p);
		mav.addObject("syscodes", syscodes);
		mav.setViewName("systemcode/systemcodelist");
		return mav;
	}
	

	
}
