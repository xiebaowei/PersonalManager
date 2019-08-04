package com.pm.mapper;

import java.util.List;
import java.util.Map;
import com.pm.model.Dept;
import com.pm.model.Duty;
import com.pm.model.Evalu;
import com.pm.model.Title;



//****************************员工考评信息以及员工信息增加方法声明

public interface EvaluMapper {

	//增加考评信息到培训表
	public void insert (Evalu evalu);
	
	//通过员工id从员工表查找相关信息
	public int findByIdemp(int eid);
	
	//通过员工姓名从员工表查找相关信息
	public int findByNameEmp(String name);
	
	//通过员工姓名从员工表查找员工ID
	public int findIdByNameEmp(String name);
	
	//通过list集合查找所有员工考评信息
	public List<Evalu> evalulist();
	
	//通过员工Id查找员工考评信息
	public List<Evalu> evalulistbyeid(int id);
	
	//通过考评表Id查找员工考评信息
	public Evalu evalulistbyid(int id);
	
	//通过考评表Id删除员工考评信息
	public void deleteById(int id);
	
	//修改员工考评信息
	public void update(Evalu evalu);
	
	
	//****************员工信息增加方法的声明*******************//
	
	
	//增加员工信息
	public void insertEmp (Map<String, Object> map);
	
	//通过员工ID查找部门表id
	public int findDeptId(int id);
	
	//通过员工ID查找职务表id
	public int findDutyId(int id);
	
	//通过员工ID查找职称表id
	public int findTitleId(int id);
	
	//查找职称表所有信息
	public List<Title> allTitle();
	
	//查找部门表所有信息
	public List<Dept> allDept();
	
	//查找职务表所有信息
	public List<Duty> allDuty();
}
