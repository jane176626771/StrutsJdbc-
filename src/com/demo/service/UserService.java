package com.demo.service;

import com.demo.bean.User;
import com.demo.dao.UserDao;

public class UserService {
	
	public boolean login(User user){
		UserDao dao = new UserDao();
		User userDB = dao.getUserByNameAndPwd(user.getName(), user.getPassword());
		if(userDB==null){
			return false;
		}else{
			return true;
		}
	}

}
