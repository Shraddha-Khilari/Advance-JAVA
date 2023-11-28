package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class HttpSender implements ReadingSender{
	
	@Qualifier("humiditySensor")
	@Autowired(required=true)
	private Sensor sensor;
	

	public HttpSender() {
		super();
	}


	public HttpSender(Sensor sensor) 
	{
		this.sensor = sensor;
	}


	@Override
	public void send() {
		int r = sensor.readValue();
		System.out.println("Sending over HTTP:"+r);
		
	}

}