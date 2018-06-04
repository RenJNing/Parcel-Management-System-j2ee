package com.domain;

public class User implements java.io.Serializable{
	private Integer user_id;
	private String email;
	private String nickname;
	private String password;
	
	public User() {
		
	}
	public User(Integer user_id) {
		this.user_id=user_id;
	}
	
	public User(Integer user_id,String email,String nickname,String password) {
		this.user_id=user_id;
		this.email=email;
		this.nickname=nickname;
		this.password=password;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
