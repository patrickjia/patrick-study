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

import com.patrick.learn.entity.Position;
import com.patrick.learn.service.IPositionService;

@Controller
@RequestMapping("position")
public class PositionManagementController {
	@Autowired
	public IPositionService positionService;
	
	@RequestMapping("viewposition")
	public ModelAndView getPositionInfo(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String positionId = request.getParameter("positionId");
		Position position = positionService.selectByPrimaryKey(positionId);
		mav.addObject("position", position);
		mav.setViewName("position/position");
		return mav;
	}
	
	
	
	@RequestMapping("list")
	public ModelAndView positionlist(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String postName = request.getParameter("postName");
		System.out.println("编码前:"+postName);
		try {
			if(null!=postName){
				postName = new String(postName.getBytes("ISO-8859-1"), "UTF-8");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("编码后:"+postName);
		
		String postCode = request.getParameter("postCode");
		//传来的分页信息
		String curPage = request.getParameter("curPage");//当前页
		String curRows = request.getParameter("curRows");//每页显示多少条
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("curPage", curPage);
		map.put("curRows", curRows);
		map.put("postName", postName);
		map.put("postCode", postCode);
		Map<String, Object> resultMap = positionService.getPositionPage(map);
		mav.addObject("condition",map);
		mav.addObject("positions", resultMap.get("positions"));
		mav.addObject("page",resultMap.get("page"));
		/*Position p  = new Position();
		List<Position> positions = positionService.selectByCondition(p);
		mav.addObject("positions", positions);*/
		mav.setViewName("position/positionlist");
		return mav;
	}
	

	
}
