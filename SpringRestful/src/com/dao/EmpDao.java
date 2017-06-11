
package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Emp;

@Repository
public class EmpDao {
	
	 @Autowired  
	 private SessionFactory sessionFactory;  
	 
	 public void setSessionFactory(SessionFactory sf) {  
		  this.sessionFactory = sf;  
		 }  

		public List<Emp> getEmpData(){
			Session session = this.sessionFactory.getCurrentSession(); 
			@SuppressWarnings("unchecked")
			List<Emp> empList = session.createQuery("from emp").list();
			
			return empList;
			
		}

}
