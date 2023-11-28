package com.sunbeam;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class  Day9Assignment2Application implements CommandLineRunner{
	@Autowired
	@Qualifier("soapSender")
	private ReadingSender restSender;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(Day9Assignment2Application.class, args);
	}
	
	@Autowired
	private ApplicationContext ctx;

public void run(String... args) throws Exception{
	ReadingSender restSender = ctx.getBean(ReadingSender.class);
	restSender.send();
	
	TcpSender sender2 =  ctx.getBean(TcpSender.class);
	sender2.send();
	
	
	
	restSender.send();
}
	


}