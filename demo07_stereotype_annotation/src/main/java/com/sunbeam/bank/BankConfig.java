package com.sunbeam.bank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.sunbeam.bank")
@Configuration
public class BankConfig {

	@Bean
	public Account acc() {
		Account a = new AccountImpl();
		a.setId(101);
		a.setType("Saving");
		a.setBalance(20000.0);
		return a;
}
}