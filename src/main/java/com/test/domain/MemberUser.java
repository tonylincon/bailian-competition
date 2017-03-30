package com.test.domain;

public class MemberUser{

	private String loginId;
	
	private String password;
	
	private String role;
	
	
	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public MemberUser(String loginId, String password, String role) {
		this.loginId = loginId;
		this.password = password;
		this.role = role;
	}

}