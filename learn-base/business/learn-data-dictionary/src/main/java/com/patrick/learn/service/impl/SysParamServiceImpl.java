package com.patrick.learn.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.patrick.learn.common.CommonUtil;
import com.patrick.learn.common.StringUtil;
import com.patrick.learn.common.constant.CommonConstant;
import com.patrick.learn.dao.ISysParamDao;
import com.patrick.learn.entity.SysParam;
import com.patrick.learn.service.ISysParamService;

/**
 * 系统参数管理业务实现类
 * 〈功能详细描述〉
 * @author    caspar.chen
 * @version   1.0.0, 2016年11月09日
 * @see       SysParamServiceImpl
 * @since     [产品/模块版本] 
 */
@Service
public class SysParamServiceImpl   implements ISysParamService {

	@Autowired
	private ISysParamDao sysParamDao;
	
	

	//@Override
	public boolean deleteByPrimaryKey(String sysParamId) {
		return sysParamDao.deleteByPrimaryKey(sysParamId) != 0 ? true : false;
	}

	//@Override
	public boolean insertSysParam(SysParam record) {
		return sysParamDao.insert(record) != 0 ? true : false;
	}

	//@Override
	public boolean insertSelective(SysParam record) {
		return sysParamDao.insertSelective(record) != 0 ? true : false;
	}

	//@Override
	public SysParam selectByPrimaryKey(String sysParamId) {
		return sysParamDao.selectByPrimaryKey(sysParamId);
	}

	//@Override
	public Map<String, Object> getSysParamPage(Map<String, String> map) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		SysParam sys = new SysParam();
		String superiorSysParamId = map.get("superiorSysParamId");
		if(StringUtil.isEmpty(superiorSysParamId)){
			superiorSysParamId = "0";
		}
		sys.setSuperiorSysParamId(superiorSysParamId);

		String curPage = (String) map.get("curPage");
		String curRows = (String) map.get("curRows");
		int pageNo = StringUtil.isEmpty(curPage) ? 1 : Integer.parseInt(curPage);
		int pageSize = StringUtil.isEmpty(curRows) ? CommonConstant.PAGE_DEFAULT_ROW : Integer.parseInt(curRows);
		PageHelper.startPage(pageNo, pageSize);
		List<SysParam> templist = sysParamDao.selectByCondition(sys);
		//用PageInfo对结果进行包装
	    PageInfo<SysParam> page = new PageInfo<SysParam>(templist);
		returnMap.put("sysParams", page.getList());
		returnMap.put("page", page);
		return returnMap;
	}

	//@Override
	public boolean updateByPrimaryKeySelective(SysParam record) {
		return sysParamDao.updateByPrimaryKeySelective(record) != 0 ? true : false;
	}

	//@Override
	public boolean updateByPrimaryKey(SysParam record) {
		return sysParamDao.updateByPrimaryKey(record) != 0 ? true : false;
	}

	//@Override
	public List<SysParam> selectSysParamTree() {
		return sysParamDao.selectSysParamTree();
	}

	//@Override
	public SysParam selectByCondition(SysParam record) {
		List<SysParam> list = selectListByCondition(record);
		if (CommonUtil.isEmptyList(list)) {
			return null;
		}
		return list.get(0);
	}

	//@Override
	public List<SysParam> selectListByCondition(SysParam record) {
		return sysParamDao.selectByCondition(record);
	}
	
}
