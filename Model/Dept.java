package com.pm.model;






//部门表属性以及对应方法（get,set,toString,构造方法等）定义
public class Dept {
	  //部门Id
	private int id;
	  //部门名称
	private String dename;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDename() {
		return dename;
	}
	public void setDename(String dename) {
		this.dename = dename;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", dename=" + dename + "]";
	}
	
}
