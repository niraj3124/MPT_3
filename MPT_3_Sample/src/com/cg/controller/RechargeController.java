package com.cg.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.service.IRechargeService;
import com.cg.bean.Recharge;

@Controller
public class RechargeController {
	
	@RequestMapping("/index")
	public String getIndexPage(){

		return "index";
	}
	
	@RequestMapping("recharge")
	public String getRechargePage(Model m){
		m.addAttribute("rechObj",new Recharge());
		return "recharge";
		
	}
	
	@Autowired
	private IRechargeService rserv;
	
	@RequestMapping(value="store",method=RequestMethod.POST)
	public String StoreRechargeInfo(Model m,@ModelAttribute("rechObj") Recharge rech){
		
		String target=null;
		int rid=rserv.addRechargeDetails(rech);
		if(rid>0){
			m.addAttribute("msg","Data Stored Successfully");
			m.addAttribute("rid", rid);
			target="success";
		}
		else{
			target="recharge";
		}
		return target;
		
	}
	
	@RequestMapping("viewall")
	public ModelAndView viewAll(){
		ModelAndView mv=new ModelAndView();
		ArrayList<Recharge> rechList=rserv.getAllRechargeInfo();
		mv.setViewName("viewall");
		mv.addObject("data", rechList);
		return mv;
	}
	
	@RequestMapping("/book")
	public String doRecharge()
	{
		
		return "book";
		
	}
	

}
