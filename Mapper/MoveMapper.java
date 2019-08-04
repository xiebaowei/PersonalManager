package com.pm.mapper;

import java.util.List;
import java.util.Map;

import com.pm.model.Dept;
import com.pm.model.Duty;
import com.pm.model.Move;




//****************************员工调动信息方法声明
public interface MoveMapper {
	
	//从部门表查询所有信息
	public List<Dept> allDept();
	
	//从职务表中查询所有信息
	public List<Duty> allDuty();
	
	//由员工ID来查询员工表里的属性项数
	public int findById(int id);
	public int findDeptId(int id);
	public int findDutyId(int id);
	public void updateByMap(Map<String,Object> map);
	public void insertByMap(Map<String,Object> map);
	public List<Move> list();
	public List<Move> listById(int id);
	
}
