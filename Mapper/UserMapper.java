package com.pm.mapper;

import java.util.List;

import com.pm.model.Employee;
import com.pm.model.User;

public interface UserMapper {
	
	public User findById(int id);
	public User findByName(String username);
	public void insert(User user);
	public List<Employee> emplist();
	public List<Employee> emplistbyid(int id);
	public void deleteById(int id);
	public void update(Employee emp);
	public int findByIdEmp(int id);
	public void updateUser(User user);
	
	
}
