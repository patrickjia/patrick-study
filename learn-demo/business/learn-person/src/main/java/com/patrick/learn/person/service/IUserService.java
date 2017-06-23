package com.patrick.learn.person.service;

import java.util.List;

import com.patrick.learn.person.entity.Person;

public interface IUserService {
	Person selectByUserId(String personId);
	
	List<Person> selectByCondition(Person person);
}
