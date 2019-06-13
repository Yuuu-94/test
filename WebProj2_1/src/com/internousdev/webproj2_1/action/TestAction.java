package com.internousdev.webproj2_1.action;

import com.internousdev.webproj2_1.dao.TestDAO;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	private String username;
	private String password;

	private String execute() {
		String ret=ERROR;
		TestDAO dao=new TestDAO();
		int count=dao.insert(username,password);
		if(count>0){
			ret=SUCCESS;
		}
		return ret;
		}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.name=name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password=password;
	}
}
