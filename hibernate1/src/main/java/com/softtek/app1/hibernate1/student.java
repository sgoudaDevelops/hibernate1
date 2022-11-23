package com.softtek.app1.hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
//@Table(name="det")
public class student {
	
	@Id
	private int sid;
	private String sname;
	private String City;
	private certificate certi;
	
	
	
	
	public certificate getCerti() {
		return certi;
	}


	public void setCerti(certificate certi) {
		this.certi = certi;
	}


	public student(int sid, String sname, String city,certificate certi) {
		super();
		this.sid = sid;
		this.sname = sname;
		City = city;
		this.certi= certi;
	}
	
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", City=" + City + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
}
