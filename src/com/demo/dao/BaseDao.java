package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
	public Connection getConnection(){
		Connection con = null;
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//�������ݿ�.����("���ݿ�Э��://ip��ַ:�˿ں�/���ݿ���", "�û���", "����");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis","root","tiger");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
}
