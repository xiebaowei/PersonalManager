package com.pm.model;




//员工表属性定义及对应方法（get,set,toString,构造方法等）定义
public class Employee {
	//员工ID（与用户表ID对应相同）
	private int id;
	//员工姓名
	private String name;
	//员工性别
	private String sex;
	//员工薪水
	private String salary;
	//员工所在部门
	private String dept;
	//员工职务
	private String duty;
	//员工职称
	private String title;
	
	public Employee() {
		super();
	}
	public Employee(String name, String sex, String salary, String dept,
			String duty, String title) {
		super();
		this.name = name;
		this.sex = sex;
		this.salary = salary;
		this.dept = dept;
		this.duty = duty;
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sex=" + sex + ", salary=" + salary + ", dept=" + dept
				+ ", duty=" + duty + ", title=" + title + "]";
	}
}
