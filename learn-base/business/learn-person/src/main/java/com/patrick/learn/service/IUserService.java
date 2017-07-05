package com.patrick.learn.service;

import java.util.List;
import java.util.Map;

import com.patrick.learn.entity.Person;


public interface IUserService {
	Person selectByUserId(String personId);
	
	List<Person> selectByCondition(Person person);
	
	Map<String, Object> getUserPage(Map<String, String> map);
}
