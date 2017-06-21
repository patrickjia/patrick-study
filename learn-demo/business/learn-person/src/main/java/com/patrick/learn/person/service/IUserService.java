package com.patrick.learn.person.service;

import com.patrick.learn.person.entity.Person;

public interface IUserService {
	Person selectByUserId(String personId);
}
