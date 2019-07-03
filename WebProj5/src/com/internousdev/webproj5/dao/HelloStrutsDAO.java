package com.internousdev.webproj5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj5.dto.HelloStrutsDTO;
import com.internousdev.webproj5.util.DBConnector;


public class HelloStrutsDAO {
	List<HelloStrutsDTO> helloStrutsDTOList=new ArrayList<HelloStrutsDTO>();

	public List<HelloStrutsDTO>select(){
		//DBConnectorのインスタンス化
		DBConnector db=new DBConnector();
		//getconnectionの呼び出し(DBtと接続）
		Connection con=db.getConnection();

		//SQL文を書く
		String sql="select * from users";

		try{
			PreparedStatement ps=con.prepareStatement(sql);//DBまで運んでくれる箱に代入
			ResultSet rs=ps.executeQuery();//実行

			while(rs.next()){
				//DBから得た情報をDTO苦楽に格納
				HelloStrutsDTO dto=new HelloStrutsDTO();
				dto.setUserId(rs.getInt("user_Id"));
				dto.setUserName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setResult("MySQLと接続出来ます。");
				helloStrutsDTOList.add(dto);
			}
		}catch(SQLException e){//エラーの対処
			e.printStackTrace();

		}
		try{
			con.close();//接続を斬る
		}catch(SQLException e){
			e.printStackTrace();
		}
		return helloStrutsDTOList;
		//DTOにはいった値を呼び出し元にあるActionクラスに戻す

	}

}
