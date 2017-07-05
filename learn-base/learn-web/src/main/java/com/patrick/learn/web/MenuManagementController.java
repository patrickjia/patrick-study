package com.patrick.learn.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.patrick.learn.entity.Menu;
import com.patrick.learn.service.IMenusService;

@Controller
@RequestMapping("menu")
public class MenuManagementController {
	@Autowired
	public IMenusService menuService;
	
	@RequestMapping("viewmenu")
	public ModelAndView getMenuInfo(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String menuCode = request.getParameter("menuCode");
		Menu menu = menuService.selectByMenuCode(menuCode);
		mav.addObject("menu", menu);
		mav.setViewName("menu/menu");
		return mav;
	}
	
	
	
	@RequestMapping("list")
	public ModelAndView menulist(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		
		String menuCode = request.getParameter("menuCode");
		String menuName = request.getParameter("menuName");
		
		System.out.println("编码前:"+menuName);
		
		String busSysCode = request.getParameter("busSysCode");
		// 传来的分页信息
		String curPage = request.getParameter("curPage");// 当前页
		String curRows = request.getParameter("curRows");// 每页显示多少条
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("curPage", curPage);
		map.put("curRows", curRows);

		map.put("menuCode", menuCode);
		map.put("menuName", menuName);
		map.put("busSysCode", busSysCode);
		
		//菜单
//		Menu menu = new Menu();
//		menu.setBusSysCode(busSysCode);
//		String tree = getMenuTree(request,menu);
//		mav.addObject("tree", tree);
		Map<String, Object> resultMap = menuService.getMenuPage(map);
		
		mav.addObject("condition", map);
		mav.addObject("menus", resultMap.get("menus"));
		mav.addObject("page", resultMap.get("page"));
		
		/*Menu menu  = new Menu();
		List<Menu> menus = menuService.selectByCondition(menu);
		mav.addObject("menus", menus);*/
		mav.setViewName("menu/menulist");
		return mav;
	}
	

	
}
