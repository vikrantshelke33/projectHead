package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Emp;
import com.service.EmpService;

@Controller
public class MyController {
	
	 @Autowired  
	 EmpService empService;  
	   
	 @RequestMapping(value = "/getAllemp", method = RequestMethod.GET, headers = "Accept=application/json")  
	 public List<Emp> getEmps() {  
	    
	  List<Emp> listOfemp = empService.getAllEmp(); 
	  
	  System.out.println("In getAllemp");
	  return listOfemp;  
	 }

	

}
