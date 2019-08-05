package com.pm.web.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pm.mapper.EvaluMapper;
import com.pm.model.Dept;
import com.pm.model.Duty;

import com.pm.model.Evalu;
import com.pm.model.Title;


	@Controller
	@RequestMapping("evalu")	
	public class EvaluController {

		@Autowired
		private EvaluMapper evaluMapper;
		@RequestMapping("list")
		public String list(Model model){
			
			List<Evalu> evalulist = evaluMapper.evalulist();
			System.out.println(evalulist.toString());
			model.addAttribute("Evalulist",evalulist);
			
			return "/html/test_list";
			
		}
		
		@RequestMapping("listbyid")
		public String listbyid(Model model,String id){
			if(!id.matches("^[0-9]*$") || id ==""){
				return "forward:list.do";
			}
			List<Evalu> evalu = evaluMapper.evalulistbyeid(Integer.parseInt(id));
			System.out.println(evalu.toString());
			model.addAttribute("Evalulist", evalu);
			
			return "/html/test_list";
			
		}
		
		
		@RequestMapping("test_edit")
		public String load(int id,Model model){
			
			Evalu evalu = evaluMapper.evalulistbyid(id);
			
			model.addAttribute("evalu", evalu);
			
			return "/html/test_edit";
			
		}
		
		
		@RequestMapping("insert")
		public String insert(String id,String lx,String result,String time,Model model){
			
			if(!id.matches("^[0-9]*$")){
				model.addAttribute("error", "ID请输入数字");
				return "/html/train_add";
			}
			
			if(id=="" || lx=="" || result==""|| time==""){
				model.addAttribute("error", "请输入完整的信息");
				return "/html/test_add";
			}
			System.out.println(id);
			if(evaluMapper.findByIdemp(Integer.parseInt(id)) == 0){
				model.addAttribute("error", "用户不存在");
				return "/html/test_add";
			}else{
				
				Evalu evalu = new Evalu(Integer.parseInt(id), lx, result, time);
				evaluMapper.insert(evalu);
				return "forward:list.do";
			}
		}
		
		@RequestMapping("update")
		public String update(int id,int eid, String lx,String result,String time){
			Evalu evalu =  evaluMapper.evalulistbyid(id);
			System.out.println(evalu);
			evalu.setLx(lx);
			evalu.setResult(result);
			evalu.setTime( time);
			evaluMapper.update(evalu);
			return "forward:list.do";
			
		}

		@RequestMapping("deleteById")
		public String deleteById(int id){
			System.out.println(id);
			evaluMapper.deleteById(id);
			
			return "forward:list.do";
			
		}
		
		@RequestMapping("add")
		public String add(Model model){
			List<Dept> deptList = evaluMapper.allDept();
			List<Duty> dutyList = evaluMapper.allDuty();
			List<Title> titleList = evaluMapper.allTitle();
			model.addAttribute("deptList", deptList);
			model.addAttribute("dutyList", dutyList);
			model.addAttribute("titleList", titleList);
			return "/html/employee_add";
		}
		
		@RequestMapping("insertemp")
		public String insert1(String eid,String name,String sex,String salary,String deid,String duid,String titid,Model model){
			
			
			if(!eid.matches("^[0-9]*$")){
				model.addAttribute("error", "ID只能为数字");
				return "forward:add.do";
			}
			if(eid=="" || deid=="" || duid==""||titid==""||sex==""||name==""||salary==""){
				model.addAttribute("error", "请输入完整信息");
				return "forward:add.do";
			}
			if(!salary.matches("^[0-9]+$")){
				model.addAttribute("error", "薪水格式错误");
				return "forward:add.do";
			}
			
			if(evaluMapper.findByIdemp(Integer.parseInt(eid)) != 0 ){
				model.addAttribute("error", "该编号已占用");
				return "forward:add.do";
			}
			
			else{	
				
				
				Map<String,Object> map = new HashMap<String,Object>();
				System.out.println(duid);
				System.out.println(titid);
				map.put("eid", eid);
				map.put("name", name);
				map.put("sex", sex);
				map.put("salary",salary );
				map.put("deid", deid);
				map.put("duid", duid);
				map.put("titid", titid);
				//evaluMapper.updateEmp(map);
				evaluMapper.insertEmp(map);
				return "redirect:/user/list.do";
			
			
		  }
	}
	
}
