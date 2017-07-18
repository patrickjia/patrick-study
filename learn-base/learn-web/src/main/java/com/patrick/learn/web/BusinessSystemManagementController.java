package com.patrick.learn.web;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.patrick.learn.common.CommonUtil;
import com.patrick.learn.common.StringUtil;
import com.patrick.learn.entity.BusSystem;
import com.patrick.learn.service.IBusSystemService;

@Controller
@RequestMapping("businesssystem")
public class BusinessSystemManagementController {
	@Autowired
	public IBusSystemService busSystemService;
	
	@RequestMapping("viewbusinesssystem")
	public ModelAndView getBusinessSystemInfo(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String busSystemId = request.getParameter("busSystemId");
		String operFlag = request.getParameter("operFlag");
		BusSystem busisystem = busSystemService.selectByPrimaryKey(busSystemId);
		mav.addObject("busisystem", busisystem);
		mav.addObject("operFlag", operFlag);
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
	
	@RequestMapping("addOrUpdateBusSystem")
	@ResponseBody
	public String addOrUpdateBusSystem(HttpServletRequest request,BusSystem busSystem ){
		String auFlag = request.getParameter("auFlag");
		String busSysId = request.getParameter("busSysId");
		String busSysCode = request.getParameter("busSysCode");
//		String busSysName = request.getParameter("busSysName");
//		String busSysSecret = request.getParameter("busSysSecret");
//		String busSysUrl = request.getParameter("busSysUrl");
//		String description = request.getParameter("description");
//		String appcode = request.getParameter("appcode");
//		String busSysIcon = request.getParameter("busSysIcon");
//		String isEnabled = request.getParameter("isEnabled");
//		BusSystem busSystem = new BusSystem();
		if("A".equals(auFlag)){
			busSysId = StringUtil.getUUID();
			//busSystem.setAppcode(getSuperDeptCode(request));
		}
		busSystem.setBusSysId(busSysId);
//		busSystem.setBusSysCode(busSysCode);
//		busSystem.setBusSysName(busSysName);
//		busSystem.setBusSysSecret(busSysSecret);
//		busSystem.setBusSysUrl(busSysUrl);
//		busSystem.setDescription(description);
		busSystem.setAppcode("TEST");
//		busSystem.setBusSysIcon(busSysIcon);
//		busSystem.setIsEnabled(isEnabled);
		System.out.println("操作标志："+auFlag+" "+busSysId);
		String msg = "操作失败！";
		//if (StringUtil.isNotEmpty(busSysId)) {
			try {
				if("A".equals(auFlag)){
					BusSystem bs = new BusSystem();
					bs.setBusSysCode(busSysCode);
					if(CommonUtil.isNotEmptyList(busSystemService.selectByCondition(bs))){
						msg = "操作失败，系统编码已经存在";
					}else{
						if(busSystemService.insertSelective(busSystem)){
							msg = "操作成功！";
						}
					}
				}else if("U".equals(auFlag)){
					if(busSystemService.updateByPrimaryKeySelective(busSystem)){
						msg = "操作成功！";
					}
				}
			} catch (Exception e) {
				msg = "操作失败 :" + e.toString();
			}
		//}
		return msg;
	}
	
}
