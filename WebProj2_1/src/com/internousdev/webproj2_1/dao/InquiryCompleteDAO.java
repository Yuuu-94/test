package com.internousdev.webproj2_1.dao;

import java.sql.PrepareStatement;

import com.internousdev.webproj2_1.util.DBConnector;
import com.mysql.jdbc.Connection;


public class InquiryCompleteDAO {
	public int insert(Strig name,String qtype,String body) {
		int ret=0;
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="insert into inquiry values(?,?,?)";
		try {
			PrepareStatement ps=con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,qtype);
			ps.setString(3,body);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println(i+"");
				ret=i;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
}
