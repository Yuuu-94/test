//検索エンジン(データアクセス）みたいな場所！！
//DTO二格納した情報をActionクラスへ渡す

package com.internousdev.login.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login.dto.LoginDTO;
import com.internousdev.login.util.DBConnector;

public class LoginDAO {
	public LoginDTO select(String name,String password) throws SQLException{
		//→loginActionから
		LoginDTO dto=new LoginDTO();
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="select * from user where user_name=? and password=?";
//値は？と記載
	try{
		PreparedStatement ps=con.prepareStatement(sql);//DB間で運んでくれる箱に代入
		ps.setString(1, name);//user_nameの？にAction→のname
		ps.setString(2,password);//passwordの？にAction→のpassword
		ResultSet rs=ps.executeQuery();
		//select文のSQLを実行するメソッド.戻り値はresultset
		

		if(rs.next()){
			dto.setName(rs.getString("user_name"));
			dto.setPassword(rs.getString("password"));
		}
	}catch(SQLException e){
		e.printStackTrace();
		//エラー処理
	}finally{
		con.close();
	}//データーベース接続終了の際に書くメソッド
	return dto;//dtoにはいった値を→Actionクラスへ
	}

}
