package com.patrick.learn.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.patrick.learn.entity.Person;
import com.patrick.learn.entity.SysParam;
import com.patrick.learn.service.ISysParamService;
import com.patrick.learn.service.IUserService;

@Controller
@RequestMapping("datadictionary")
public class DataDictionaryManagementController {
	@Autowired
	public ISysParamService sysParamService;
	
	@RequestMapping("viewdatadictionary")
	public ModelAndView getDatadictionaryInfo(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String sysParamId = request.getParameter("sysParamId");
		SysParam sysParam = sysParamService.selectByPrimaryKey(sysParamId);
		mav.addObject("sysParam", sysParam);
		mav.setViewName("datadictionary/datadictionary");
		return mav;
	}
	
	
	@RequestMapping("list")
	public ModelAndView datadiclist(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		SysParam p  = new SysParam();
		List<SysParam> sysparams = sysParamService.selectListByCondition(p);
		mav.addObject("sysparams", sysparams);
		mav.setViewName("datadictionary/datadictionarylist");
		return mav;
	}
	

	
}
