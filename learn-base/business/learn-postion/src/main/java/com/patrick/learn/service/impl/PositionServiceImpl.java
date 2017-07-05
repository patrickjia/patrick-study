package com.patrick.learn.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.patrick.learn.common.StringUtil;
import com.patrick.learn.common.constant.CommonConstant;
import com.patrick.learn.dao.IPositionDao;
import com.patrick.learn.entity.Position;
import com.patrick.learn.service.IPositionService;

/**
 * 岗位管理业务实现类 〈功能详细描述〉
 * 
 * @author caspar.chen
 * @version 1.0.0, 2016年10月30日
 * @see PositionServiceImpl
 * @since [产品/模块版本]
 */
@Service
public class PositionServiceImpl implements IPositionService {

	@Autowired
	private IPositionDao positionDao;

	

	//@Override
	public boolean deleteByPrimaryKey(String postId) {
		return positionDao.deleteByPrimaryKey(postId) != 0 ? true : false;
	}

	

	//@Override
	public Position selectByPrimaryKey(String postId) {
		return positionDao.selectByPrimaryKey(postId);
	}

	//@Override
	public boolean updateByPrimaryKeySelective(Position record) {
		return positionDao.updateByPrimaryKeySelective(record) != 0 ? true
				: false;
	}

	//@Override
	public boolean updateByPrimaryKey(Position record) {
		return positionDao.updateByPrimaryKey(record) != 0 ? true : false;
	}

	

	//@Override
	public Map<String, Object> getPositionPage(Map<String, String> map) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		Position position = new Position();
		position.setPostId(map.get("postId"));
		position.setPostName(map.get("postName"));
		position.setPostCode(map.get("postCode"));

		String curPage = (String) map.get("curPage");
		String curRows = (String) map.get("curRows");
		int pageNo = StringUtil.isEmpty(curPage) ? 1 : Integer
				.parseInt(curPage);
		int pageSize = StringUtil.isEmpty(curRows) ? CommonConstant.PAGE_DEFAULT_ROW
				: Integer.parseInt(curRows);
		PageHelper.startPage(pageNo, pageSize);
		List<Position> templist = positionDao.selectByCondition(position);
		// 用PageInfo对结果进行包装
		PageInfo<Position> page = new PageInfo<Position>(templist);
		returnMap.put("positions", page.getList());
		returnMap.put("page", page);
		return returnMap;
	}

	public List<Position> selectByCondition(Position record) {
		return positionDao.selectByCondition(record);
	}

	public List<Position> selectPostionByPerson(String personId) {
		return positionDao.selectPostionByPerson(personId);
	}

}
