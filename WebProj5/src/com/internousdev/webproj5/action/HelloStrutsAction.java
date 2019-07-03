package com.internousdev.webproj5.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.webproj5.dao.HelloStrutsDAO;
import com.internousdev.webproj5.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport implements SessionAware{
	//Struts２が持つActionSupportというクラスの継承

	private List<HelloStrutsDTO> helloStrutsDTOList=new ArrayList<HelloStrutsDTO>();
	private Map<String,Object> session;
	//マッピングをあらわすデータ構造


	public String execute(){
		String ret=ERROR;
		HelloStrutsDAO dao=new HelloStrutsDAO();
		helloStrutsDTOList=dao.select();

		if(helloStrutsDTOList.size()>0){
			session.put("helloStrutsDTOList", helloStrutsDTOList);
			ret=SUCCESS;
		}else{
			ret=ERROR;
		}
		return ret;

	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object>session){
		this.session=session;
	}
}


/*　Actionクラス
setter定義→JSPで入力した値がフィールドに格納

execute メッソドを定義

条件分岐のERROR orSUCCESS(最初はERROR
ユーザーが入力した値とDTOに格納してある値を比較)

executeメッソドの結果　SUCCESS ERRORを返す→strutsxmlに遷移先にあるjspに振り分け
*/