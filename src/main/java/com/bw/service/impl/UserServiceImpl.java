package com.bw.service.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.bw.entity.User;
import com.bw.mapper.UserDao;
import com.bw.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao uDao;

	public boolean login(HttpSession session, User user) {
		// TODO Auto-generated method stub
		User u=uDao.login(user);
		if (u!=null) {
			session.setAttribute("user", u);
			return true;
		}
		return false;
	}
	
	
	
}
