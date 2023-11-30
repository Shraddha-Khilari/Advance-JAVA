package com.sunbeam.pojos;

/**
 * Advanced Java @ DMC Sep 2023
 * Trainer: Nilesh Ghule
 * Time: 2023-11-28 15:38 
 */
public class Credentials {
	private String email;
	private String passwd;
	public Credentials() {
	}
	public Credentials(String email, String passwd) {
		this.email = email;
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "Credentials [email=" + email + ", passwd=" + passwd + "]";
	}
}
