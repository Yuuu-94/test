package com.internousdev.webproj2_1.action;

import java.sql.PrepareStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.webproj2_1.util.DBConnector;
import com.mysql.jdbc.Connection;

public class LoginDAO {
	public String username;
	public String password;

	public boolean select(String username,String password) {
		boolean ret=false;
		DBConnector db=new DBConnector();
		Connection con = db.getConnection();

		String sql="select *from users where user_name=? and password=?";
		try {
			PrepareStatement ps=con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				this.username=rs.getString("user_name");
				this.password=rs.getString("password");
				ret=true;
			}
		}catch(SQLException e) {
			e.printStackTrade();
		}
	try {
		con.close();
	}catch(SQLException e) {
		e.printStackTrade();
	}
	return ret;
	}
}
