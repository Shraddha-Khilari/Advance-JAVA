package com.sunbeam.dmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:beans.xml")
@SpringBootApplication
public class Demo05DepInjectionApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Demo05DepInjectionApplication.class,args);		
	}
		@Autowired
		private ApplicationContext ctx;
		
	public void run(String... args) throws Exception {
		
			Person p1 = (Person) ctx.getBean("p1");
			System.out.println("p1: " + p1.toString());
		
			Account a1 = (Account) ctx.getBean("a1");
			System.out.println("a1: " + a1.toString());

			Account a2 = (Account) ctx.getBean("a2");
			System.out.println("a2: " + a2.toString());
			
			Person p2 = (Person)ctx.getBean("p2");
			System.out.println("p2: "+p2.toString());
			
			Account a3 = (Account) ctx.getBean("a3");
			System.out.println("a3: " + a1.toString());
			
			Account a4 = (Account) ctx.getBean("a4");
			System.out.println("a4: " + a1.toString());
			
	}
}
