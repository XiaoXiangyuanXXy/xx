package com.bw.mapper;

import javax.servlet.http.HttpSession;

import com.bw.entity.User;

public interface UserDao {
	User login(User user);

}
