package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	private String empid;
	private String band;
	private String buffertype;
	
	

	public Emp(String empid, String band, String buffertype) {
		super();
		this.empid = empid;
		this.band = band;
		this.buffertype = buffertype;
	}

	public Emp() {
		super();
		
	}


	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getBuffertype() {
		return buffertype;
	}
	public void setBuffertype(String buffertype) {
		this.buffertype = buffertype;
	}


	
	
	

}
