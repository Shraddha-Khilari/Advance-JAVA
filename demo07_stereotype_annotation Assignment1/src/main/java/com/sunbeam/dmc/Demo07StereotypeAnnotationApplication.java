package com.sunbeam.dmc;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.boot.CommandLineRunner;



import com.sunbeam.bank.Account;
import com.sunbeam.bank.BankConfig;
import com.sunbeam.bank.ConsoleLoggerImpl;
import com.sunbeam.bank.FileLoggerImpl;
import com.sunbeam.bank.Logger;

@Import(BankConfig.class)
@SpringBootApplication
public class Demo07StereotypeAnnotationApplication implements CommandLineRunner {
    
	public static void main(String[] args) {
		SpringApplication.run(Demo07StereotypeAnnotationApplication.class, args);
	}
		@Autowired
		private ApplicationContext ctx;
		
		@Override
		public void run(String... args) throws Exception {
			Logger logger1 = ctx.getBean(ConsoleLoggerImpl.class);
			logger1.log("message 1");
			Logger logger2 = ctx.getBean(FileLoggerImpl.class);
			logger2.log("message 2");
			Logger logger3 = ctx.getBean(Logger.class);
			logger3.log("message 3");
			
			/*
			 * Account acc = ctx.getBean(Account.class); acc.setLogger(logger1);
			 * acc.deposit(53000.0); acc.withdraw(23000.0); acc.setLogger(logger2);
			 * acc.deposit(12000.0); acc.withdraw(33000.0);
			 * System.out.println("Final Balance: " + acc.getBalance());
			 */
			
			Account acc = (Account) ctx.getBean("acc");
			acc.deposit(8000);
			acc.withdraw(50000);
		
	}

}
