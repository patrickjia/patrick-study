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

import com.patrick.learn.entity.BusSystem;
import com.patrick.learn.entity.Person;
import com.patrick.learn.service.IBusSystemService;
import com.patrick.learn.service.IUserService;

@Controller
@RequestMapping("businesssystem")
public class BusinessSystemManagementController {
	@Autowired
	public IBusSystemService busSystemService;
	
	@RequestMapping("viewbusinesssystem")
	public ModelAndView getBusinessSystemInfo(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String busSystemId = request.getParameter("busSystemId");
		BusSystem busisystem = busSystemService.selectByPrimaryKey(busSystemId);
		mav.addObject("busisystem", busisystem);
		mav.setViewName("businesssystem/businesssystem");
		return mav;
	}
	
	
	
	@RequestMapping("list")
	public ModelAndView businesssystemlist(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		
		String busSysCode = request.getParameter("busSysCode");
		String busSysName = request.getParameter("busSysName");
		System.out.println("编码前:"+busSysName);
		try {
			if(null!=busSysName){
				busSysName = new String(busSysName.getBytes("ISO-8859-1"), "UTF-8");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("编码后:"+busSysName);
		//传来的分页信息
		String curPage = request.getParameter("curPage");//当前页
		String curRows = request.getParameter("curRows");//每页显示多少条
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("curPage", curPage);
		map.put("curRows", curRows);
		map.put("busSysCode", busSysCode);
		map.put("busSysName", busSysName);
		Map<String, Object> resultMap = busSystemService.getBusSystemPage(map);
		mav.addObject("busisystems", resultMap.get("busSystems"));
		mav.addObject("condition",map);
		mav.addObject("page",resultMap.get("page"));
		
		/*BusSystem p  = new BusSystem();
		List<BusSystem> busisystems = busSystemService.selectByCondition(p);
		mav.addObject("busisystems", busisystems);*/
		mav.setViewName("businesssystem/businesssystemlist");
		return mav;
	}
	

	
}
