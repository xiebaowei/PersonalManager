package com.pm.model;





//培训表对应的属性及方法（get,set,toString,构造方法等）的定义
public class Train {
	//培训ID
	private int id;
	//员工ID
	private int empid;
	//员工姓名
	private String ename;
	//培训开始时间
	private String begintime;
	//培训课程
	private String course;
	//培训成绩
	private String score;
	//培训结束时间
	private String endtime;
	public Train() {
		super();
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Train(int empid,String time, String course, String score) {
		super();
		this.empid = empid;
		this.begintime = time;
		this.course = course;
		this.score = score;
		this.endtime = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
	public String getBegintime() {
		return begintime;
	}
	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	@Override
	public String toString() {
		return "Train [id=" + id + ", empid=" + empid + ", ename=" + ename
				+ ", begintime=" + begintime + ", course=" + course
				+ ", score=" + score + ", endtime=" + endtime + "]";
	}
	
}
