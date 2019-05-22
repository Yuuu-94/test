package com.internousdev.login.dto;

public class LoginDTO {
	private int id;
	private String name;
	private String password;
	//privateなので箱の中身は表示できない
	//tableの型に合ったフィールド変数を宣言

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
	}
	//値の入力→表示できない箱にいれる

	public String getName(){
		return name;
	} //Actionクラスから呼び出されActionへ渡す

	public void setName(String name){
		this.name=name;
	}//DAOクラスから呼び出され

	public String getPassword(){
		return password;
	}//Actionクラスから呼び出され、パスワードフィールドの値をActionへ渡す

	public void  setPassword(String password){
		this.password=password;
	}

}
