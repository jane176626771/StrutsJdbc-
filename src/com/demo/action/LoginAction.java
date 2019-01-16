package com.demo.action;

import com.demo.bean.User;
import com.demo.service.UserService;

public class LoginAction {
	private User user;
	private UserService userService;
	public String login(){
		userService = new UserService();
		boolean flag = userService.login(user);
		if(flag){
			return "list";
		}else{
			return "login";
		}
		
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
