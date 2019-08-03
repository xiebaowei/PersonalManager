package com.pm.model;



//职务表对应的属性及方法（get,set,toString,构造方法等）的定义
public class Duty {
	  //职务Id 
	private int id;
	  //职务名称
	private String duname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDuname() {
		return duname;
	}
	public void setDuname(String duname) {
		this.duname = duname;
	}
	@Override
	public String toString() {
		return "Duty [id=" + id + ", duname=" + duname + "]";
	}
	
	
}
