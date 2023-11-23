package com.sunbeam.beans;

import java.sql.Date;

import com.sunbeam.daos.UserDao;
import com.sunbeam.pojos.User;

public class RegisterBean {

	private String name;
	private String address;
	private Date birth;
	private String mobile;
	private String email;
	private String passwd;
	
	private int count;
	
	public void ResisterBean() {
	}
	
	public String getCount() {
		return email;
	}
	public void setCount(String ncount) {
		this.count= count;
	}
	//name
	public String getName() {
		return email;
	}
	public void setName(String name) {
		this.name= name;
	}
	//address
	public String getAddress() {
		return passwd;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//birth
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	//email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//password
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	//mobile
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	public void registerUser() {
		User u = new User(0, name, passwd, mobile, email, address, birth, 1, "ROLE_CUSTOMER");
		  
		   try(UserDao userDao = new UserDao()) {
				int count = userDao.save(u);
				
				
			} catch (Exception e) {
				e.printStackTrace();
		}
	}
}
		

	

	
