package com.patrick.learn.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.patrick.learn.common.StringUtil;
import com.patrick.learn.common.constant.CommonConstant;
import com.patrick.learn.dao.IBusSystemDao;
import com.patrick.learn.entity.BusSystem;
import com.patrick.learn.service.IBusSystemService;

/**
 *
 * @author caspar.chen
 * @date 2016-11-6
 */
@Service
public class IBusSystemServiceImpl  implements IBusSystemService{

	@Autowired
	private IBusSystemDao busSystemDao;
	
	public Map<String, Object> getBusSystemPage(Map<String, String> map) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		BusSystem busSystem = new BusSystem();
		busSystem.setBusSysId(map.get("busSysId"));
		busSystem.setBusSysCode(map.get("busSysCode"));
		busSystem.setBusSysName(map.get("busSysName"));
		
		String curPage = (String) map.get("curPage");
		String curRows = (String) map.get("curRows");
		int pageNo = StringUtil.isEmpty(curPage) ? 1 : Integer.parseInt(curPage);
		int pageSize = StringUtil.isEmpty(curRows) ? CommonConstant.PAGE_DEFAULT_ROW : Integer.parseInt(curRows);
		PageHelper.startPage(pageNo, pageSize);
		List<BusSystem> templist = busSystemDao.selectByCondition(busSystem);
		//用PageInfo对结果进行包装
	    PageInfo<BusSystem> page = new PageInfo<BusSystem>(templist);
		returnMap.put("busSystems", page.getList());
		returnMap.put("page", page);
		return returnMap;
	}

	
	public boolean deleteByPrimaryKey(String busSystemId) {
		return busSystemDao.deleteByPrimaryKey(busSystemId) != 0 ? true : false;
	}

	
	public boolean insertSelective(BusSystem record) {
		return busSystemDao.insertSelective(record) != 0 ? true : false;
	}

	
	public BusSystem selectByPrimaryKey(String busSystemId) {
		return busSystemDao.selectByPrimaryKey(busSystemId);
	}

	
	public boolean updateByPrimaryKeySelective(BusSystem record) {
		return busSystemDao.updateByPrimaryKeySelective(record) != 0 ? true : false;
	}

	
	public boolean updateByPrimaryKey(BusSystem record) {
		return busSystemDao.updateByPrimaryKey(record) != 0 ? true : false;
	}

	

	public List<BusSystem> selectByCondition(BusSystem busSystem) {
		return busSystemDao.selectByCondition(busSystem);
	}

	public List<BusSystem> getAppcodeFromBusSytem(BusSystem b) {
		return busSystemDao.getAppcodeFromBusSytem(b);
	}

	public List<BusSystem> getBusSystemByPerson(String personCode) {
		return busSystemDao.getBusSystemByPerson(personCode);
	}

}
