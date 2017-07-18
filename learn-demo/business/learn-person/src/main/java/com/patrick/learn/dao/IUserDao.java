package com.patrick.learn.person.dao;

import java.util.List;

import com.patrick.learn.person.entity.Person;

public interface IUserDao {
	List<Person> selectByUserId(String personId);
	
	List<Person> selectByCondition(Person person);
}
