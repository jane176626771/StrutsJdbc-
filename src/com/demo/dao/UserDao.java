package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.bean.User;

public class UserDao extends BaseDao{
	public User getUserByNameAndPwd(String name,String pwd){
		User user = null;
		Connection conn = getConnection();
		if(conn!=null){
			PreparedStatement ps;
			try {
				ps = conn.prepareStatement("select * from user where name=? and password=?");
				ps.setString(1, name);
				ps.setString(2, pwd);
				ResultSet rs = ps.executeQuery();
				if(rs.next()){
					user = new User();
					user.setId(rs.getInt("id"));
					user.setName(rs.getString("name"));
					user.setPassword(rs.getString("password"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}
}
