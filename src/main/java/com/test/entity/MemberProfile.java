package com.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author zhuweizhu
 *
 */
@Entity
@Table(name="member_profile")
public class MemberProfile implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7419613701662154106L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pkId; 
	
	@Column(nullable = false)
	private String loginId;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String role;
	
	public Long getPkId() {
		return pkId;
	}

	public MemberProfile() {

	}
	
	public MemberProfile(String loginId, String password, String role) {
		this.loginId = loginId;
		this.password = password;
		this.role = role;
	}

	public void setPkId(Long pkId) {
		this.pkId = pkId;
	}

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

}
