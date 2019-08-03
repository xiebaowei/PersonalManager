package com.pm.model;





//员工调动表属性定义及对应方法（get,set,toString,构造方法等）定义
public class Move {
	
	//调动ID
	private int id;
	//员工ID
	private	int eid;
	//员工姓名
	private	String ename;
	//调动前部门
	private	String dept1;
	//调动后部门
	private	String dept2;
	//调动前职务
	private String duty1;
	//调动后职务
	private String duty2;
	//调动时间
	private String date;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept1() {
		return dept1;
	}
	public void setDept1(String dept1) {
		this.dept1 = dept1;
	}
	public String getDept2() {
		return dept2;
	}
	public void setDept2(String dept2) {
		this.dept2 = dept2;
	}
	public String getDuty1() {
		return duty1;
	}
	public void setDuty1(String duty1) {
		this.duty1 = duty1;
	}
	public String getDuty2() {
		return duty2;
	}
	public void setDuty2(String duty2) {
		this.duty2 = duty2;
	}
	@Override
	public String toString() {
		return "Move [id=" + id + ", eid=" + eid + ", ename=" + ename + ", dept1=" + dept1 + ", dept2=" + dept2
				+ ", duty1=" + duty1 + ", duty2=" + duty2 + ", date=" + date + "]";
	}
	
	
}
