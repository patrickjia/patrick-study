package com.patrick.learn.service.impl;

import java.util.ArrayList;
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
import com.patrick.learn.dao.IUserDao;
import com.patrick.learn.entity.Person;
import com.patrick.learn.service.IUserService;


@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDao userDao;
	
	public Person selectByUserId(String personId) {
		List<Person> list = userDao.selectByUserId(personId);
		if (CommonUtil.isNotEmptyList(list)) {
			Person returnPeron = list.get(0);
			if (list.size() > 1) {
				for (Person person : list) {
					if (person.getDeptType().equals("0")) {
						returnPeron.setDeptCode(person.getDeptCode());
						returnPeron.setDeptCodeName(person.getDeptCodeName());
					} else if (person.getDeptType().equals("1")) {
						returnPeron.setDeptCode2(person.getDeptCode());
						returnPeron.setDeptCode2Name(person.getDeptCodeName());
					}
				}
			}
			return returnPeron;
		}
		return null;
	}

	public List<Person> selectByCondition(Person person){
		return userDao.selectByCondition(person);
	}
	
	public Map<String, Object> getUserPage(Map<String, String> map) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		Person person = new Person();
		person.setPersonCode(map.get("personCode"));
		person.setPersonName(map.get("personName"));
		person.setPersonType(map.get("personType"));
		person.setAppcode(map.get("appcode"));
		// person.setDeptCode(map.get("deptCode"));
		person.setLoginName(map.get("loginName"));
		person.setDeptCodeName(map.get("deptName"));
		String compUserFlag = map.get("compUserFlag");
		String curPage = (String) map.get("curPage");
		String curRows = (String) map.get("curRows");
		int pageNo = StringUtil.isEmpty(curPage) ? 1 : Integer
				.parseInt(curPage);
		int pageSize = StringUtil.isEmpty(curRows) ? CommonConstant.PAGE_DEFAULT_ROW
				: Integer.parseInt(curRows);
		PageHelper.startPage(pageNo, pageSize);
		List<Person> templist = new ArrayList<Person>();
		if ("1".equals(compUserFlag)) {
			templist = userDao.selectCompUserByCondition(person);
		} else {
			templist = userDao.selectByCondition(person);
		}
		// 用PageInfo对结果进行包装
		PageInfo<Person> page = new PageInfo<Person>(templist);
		returnMap.put("users", page.getList());
		returnMap.put("page", page);
		return returnMap;
	}
}
