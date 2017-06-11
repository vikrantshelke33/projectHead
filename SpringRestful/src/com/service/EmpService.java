package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Emp;
import com.dao.EmpDao;

@Service("empService")
public class EmpService {
	
	@Autowired
	EmpDao empDao;
	
	 @Transactional  
	 public List<Emp> getAllEmp() {  
	  return empDao.getEmpData();  
	 } 


}
