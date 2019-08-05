package com.pm.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pm.mapper.TrainMapper;

import com.pm.model.Train;

@Controller
@RequestMapping("train")
public class TrainController {
	
	@Autowired
	private TrainMapper trainMapper;
	@RequestMapping("list")
	public String list(Model model){
		List<Train> train = trainMapper.tralist();
		
		model.addAttribute("train", train);
		
		return "/html/train_list";
		
	}
	@RequestMapping("listbyeid")
	public String listbyeid(Model model,String id){
		if(!id.matches("^[0-9]*$") || id ==""){
			return "forward:list.do";
		}
		List<Train> train = trainMapper.tralistbyeid(Integer.parseInt(id));
		System.out.println(train.toString());
		model.addAttribute("train", train);
		
		return "/html/train_list";
		
	}
	
	@RequestMapping("train_edit")
	public String load(int id,Model model){
		
		Train tra = trainMapper.tralistbyid(id);
		model.addAttribute("tra", tra);
		
		return "/html/train_edit";
		
	}
	
	@RequestMapping("update")
	public String update(int id,int eid,String begintime,String endtime,String course,String score){
		Train tra = trainMapper.tralistbyid(id);
		System.out.println(tra);
		tra.setBegintime(begintime);
		tra.setCourse(course);
		tra.setScore(score);
		tra.setEndtime(endtime);
		trainMapper.update(tra);
		return "forward:list.do";
		
	}
	
	@RequestMapping("insert")
	public String insert(String empid,String time,String course,String score,Model model){
		
		if(!empid.matches("^[0-9]*$")){
			model.addAttribute("error", "ID请输入数字");
			return "/html/train_add";
		}
		if(empid=="" || time=="" || course==""|| score==""){
			model.addAttribute("error", "请输入完整的信息");
			return "/html/train_add";
		}
		System.out.println(empid);
		if(trainMapper.findById(Integer.parseInt(empid)) == 0 ){
			model.addAttribute("error", "该员工不存在");
			return "/html/train_add";
		}else{
			Train tra = new Train(Integer.parseInt(empid),time,course,score);
			trainMapper.insert(tra);
			return "forward:list.do";
		}
	}
	@RequestMapping("deleteById")
	public String deleteById(int id){
		System.out.println(id);
		trainMapper.deleteById(id);
		
		return "forward:list.do";
		
	}
	
}
