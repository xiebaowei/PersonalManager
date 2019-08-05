package com.pm.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pm.mapper.MoveMapper;
import com.pm.model.Dept;
import com.pm.model.Duty;
import com.pm.model.Move;


@Controller
@RequestMapping("move")
public class MoveController {
	
	@Autowired
	private MoveMapper moveMapper;
	
	@RequestMapping("add")
	public String add(Model model){
		List<Dept> deptList = moveMapper.allDept();
		List<Duty> dutyList = moveMapper.allDuty();
		model.addAttribute("deptList", deptList);
		model.addAttribute("dutyList", dutyList);
		return "/html/move_add";
	}
	@RequestMapping("insert")
	public String insert(String eid,String deid,String duid,Model model){
		
		if(!eid.matches("^[0-9]*$")){
			model.addAttribute("error", "ID只能为数字");
			return "forward:add.do";
		}
		if(eid=="" || deid=="" || duid==""){
			model.addAttribute("error", "请输入完整信息");
			return "forward:add.do";
		}
		if(moveMapper.findById(Integer.parseInt(eid)) == 0 ){
			model.addAttribute("error", "没有该用户");
			return "forward:add.do";
		}else{
			
			
			Map<String,Object> map = new HashMap<String,Object>();
			System.out.println(eid+deid+duid+"****************************");
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			map.put("eid", eid);
			map.put("deid1", moveMapper.findDeptId(Integer.parseInt(eid)));
			map.put("duid1", moveMapper.findDutyId(Integer.parseInt(eid)));
			map.put("deid2", deid);
			map.put("duid2", duid);
			map.put("datatime", df.format(new Date()));
			moveMapper.updateByMap(map);
			moveMapper.insertByMap(map);
			return "forward:list.do";
		}
	}
	
	@RequestMapping("list")
	public String list(Model model){
		List<Move> movelist = moveMapper.list();
		System.out.println(movelist);
		model.addAttribute("movelist", movelist);
		
		return "/html/move_list";
		
	}
	@RequestMapping("listbyeid")
	public String listbyeid(Model model,String id){
		if(!id.matches("^[0-9]*$") || id ==""){
			return "forward:list.do";
		}
		List<Move> movelist = moveMapper.listById(Integer.parseInt(id));
		model.addAttribute("movelist", movelist);
		
		return "/html/move_list";
		
	}
}
