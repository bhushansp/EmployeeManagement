package com.te.springrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.te.springrest.dao.UserDao;
@Service
@Transactional
public class UserServiceIml {
	@Autowired
	UserDao dao;
}
