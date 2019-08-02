package com.pm.model;







//用户表对应的属性及方法（get,set,toString,构造方法等）的定义
public class User {
	
	//用户ID
	public int id;
	//用户名
	public String username;
	//用户密码
	public String password;
	public int getId() {
		return id;
	}
	public User() {
		super();
	}
	public User(int id ,String username, String password) {
		this.id = id ;
		this.username = username;
		this.password = password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
}
