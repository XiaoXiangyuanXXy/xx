package com.bw.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.entity.User;
import com.bw.mapper.UserDao;
import com.bw.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	
	@RequestMapping("/login")
	@ResponseBody
	public boolean login(HttpSession session,User user){
		boolean flag=userService.login(session,user);
		return flag;
	}

}
