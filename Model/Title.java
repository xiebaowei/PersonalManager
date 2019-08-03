package com.pm.model;





//职称表对应的属性及方法（get,set,toString,构造方法等）的定义
public class Title {
	//职称Id
	private int id;
	//职称名称
	private String tname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Title [id=" + id + ", tname=" + tname + "]";
	}
	
}
