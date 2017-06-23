package com.patrick.learn.person.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patrick.learn.common.CommonUtil;
import com.patrick.learn.person.dao.IUserDao;
import com.patrick.learn.person.entity.Person;
import com.patrick.learn.person.service.IUserService;

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
}
