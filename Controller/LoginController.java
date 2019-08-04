package com.pm.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pm.mapper.UserMapper;
import com.pm.model.Employee;
import com.pm.model.User;

@Controller
@RequestMapping("user")	
public class LoginController {

	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("login")
	public String  login(String username,String password,Model model) {
		

		User user = new User();
		user = userMapper.findByName(username);
		
		if(user != null&&user.getPassword().equals(password)){
			
			if(user.getUsername().equals("admin")){
				return "redirect:/html/index.jsp?id"+user.getId();
			}else{
				List<Employee> emplist = userMapper.emplistbyid(user.getId());
				Employee emp = emplist.get(0);
				model.addAttribute("emp", emp);
				return "redirect:/html/index2.jsp?id="+emp.getId();
			}
			
		}else{
			
			model.addAttribute("error", "用户名或密码错误");
			return "index";
		}
	}
	
	@RequestMapping("regist")
	public String regist(String username,int id ,String password,Model model){
		User user = new User();
		user = userMapper.findByName(username);
		if(username =="" || password == ""|| id ==0){
			model.addAttribute("error", "请输入完整的信息");
			return "html/user_add";
		}
		if(!username.matches("^[A-Za-z0-9]+$") || !password.matches("^[A-Za-z0-9]+$")){
			model.addAttribute("error", "用户名或密码格式错误");
			return "html/user_add";
		}
		if(user != null){
			model.addAttribute("error", "用户已存在");
			return "html/user_add";
		}

		if (userMapper.findByIdEmp(id)==0){
			model.addAttribute("error", "该员工不存在");
			return "html/user_add";
			
		}
		
		else{
			if(userMapper.findById(id)!=null){
				model.addAttribute("error", "该员工已注册");
				return "html/user_add";
			}
			User user1 = new User(id,username,password);
			userMapper.insert(user1);
			return "index";
		}
	}

	@RequestMapping("list")
	public String list(Model model){
		List<Employee> Emplist = userMapper.emplist();
		model.addAttribute("Emplist", Emplist);
		
		return "/html/emp_list";
		
	}
	
	@RequestMapping("listbyid")
	public String listbyid(Model model,String id){
		if(!id.matches("^[0-9]*$") || id ==""){
			return "forward:list.do";
		}
		List<Employee> Emplist = userMapper.emplistbyid(Integer.parseInt(id));
		System.out.println(Emplist.toString());
		model.addAttribute("Emplist", Emplist);
		
		return "/html/emp_list";
		
	}
	@RequestMapping("listbyid2")
	public String listbyid2(Model model,String id){
		if(!id.matches("^[0-9]*$") || id ==""){
			return "forward:list.do";
		}
		List<Employee> Emplist = userMapper.emplistbyid(Integer.parseInt(id));
		System.out.println(Emplist.toString());
		model.addAttribute("Emplist", Emplist);
		
		return "/html/emp_list2";
		
	}
	
	@RequestMapping("deleteById")
	public String deleteById(int id){
		System.out.println(id);
		userMapper.deleteById(id);
		
		return "forward:list.do";
		
	}
	
	@RequestMapping("emp_edit")
	public String load(int id,Model model){
		List<Employee> Emplist = userMapper.emplistbyid(id);
		Employee emp = Emplist.get(0);
		model.addAttribute("emp", emp);
		
		return "/html/emp_edit";
		
	}
	
	@RequestMapping("update")
	public String update(int id,String name,String sex,String salary,Model model){
		if(!salary.matches("^[0-9]*$")){
			model.addAttribute("error", "薪水格式错误");
			return "forward:emp_edit.do";
		}
		List<Employee> Emplist = userMapper.emplistbyid(id);
		Employee emp = Emplist.get(0);
		emp.setName(name);
		emp.setSex(sex);
		emp.setSalary(salary);
		userMapper.update(emp);
		return "redirect:list.do";
		
	}
	@RequestMapping("updateUser")
	public String updateUser(String old,String new1,String new2,String id,Model model){
		User user = new User();
		user = userMapper.findById(Integer.parseInt(id));
		if(old =="" || new1 == ""|| new2 == ""){
			model.addAttribute("error", "请输入完整的信息");
			return "html/update";
		}
		if(!old.equals(user.getPassword())){
			model.addAttribute("error", "原密码错误");
			return "html/update";
		}
		if(!new1.matches("^[A-Za-z0-9]+$") || !new2.matches("^[A-Za-z0-9]+$")){
			model.addAttribute("error", "新密码格式错误");
			return "html/update";
		}
		if(!new1.equals(new2)){
			model.addAttribute("error", "新密码不一致");
			return "html/update";
		}
		user.setPassword(new1);
		userMapper.updateUser(user);
		return "redirect:../index.jsp";
		
	}
	
}
