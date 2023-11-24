package com.sunbeam.dmc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
	public class BankConfig {
	@Bean
	public Person p2() {
	Person p = new PersonImpl();
	p.setName("Nitin");
	p.setAge(45);
	return p;
	}
	@Bean
	public Account a3() {
	Account a = new AccountImpl();
	a.setId(101);
	a.setType("Saving");
	a.setBalance(5000.0);
	
	a.setAccHolder(p2());
	return a;
	}
	@Bean
	public Account a4() {
	Account a;
	a = new AccountImpl(202, "Current", 200000, p2());
	return a;
	}
	@Bean
	public Account a5(@Qualifier("p2") Person p) {
		AccountImpl a = new AccountImpl(505, "Current", 1000000.0, p);
		return a;
	}
 }

