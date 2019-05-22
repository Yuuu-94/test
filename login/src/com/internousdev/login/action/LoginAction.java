//login.jspで入力したものが受けとられる場所！！

package com.internousdev.login.action;

import java.sql.SQLException;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	//actionsupportというクラスの継承
	private String name;
	private String password;
	//jspで入力したものが格納○

	public String execute() throws SQLException{
		String ret =ERROR;//
		//みんなエラー(戻り値、ここに帰ってくる）
		//入力後間違っている場合はstruts.xmlで定義した失敗画面へ移動

		LoginDAO dao =new LoginDAO();
		LoginDTO dto=new LoginDTO();
		//インスタンス化

		dto=dao.select(name,password);
		/* 入力したname,passwordをもとに→loginDAOのselectメソッドへ
		 daoでセレクトした結果＝dtoに代入
		 */

		if(name.equals(dto.getName())){
			if(password.equals(dto.getPassword())){
				ret=SUCCESS;//struts.xmlにページの移動で定義したサクセス画面へ
			}
		}//みんなあっていればサクセス
		//dtoに格納されている（代入されたdto.getName()とdto.getPassword()）name,passwordと＝であればサクセス二書き換え
		
		return ret;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password=password;
	}

}


