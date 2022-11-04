package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class HistoryForm implements Serializable { //フロントからデータを渡すため
	private static final long serialVersionUID =1L;
	
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
