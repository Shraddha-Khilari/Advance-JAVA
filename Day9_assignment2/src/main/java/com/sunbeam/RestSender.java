
package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RestSender implements ReadingSender{

	@Qualifier("temperatureSensor")
	@Autowired
	private Sensor sensor;
	

	public RestSender(Sensor sensor) 
	{
		this.sensor = sensor;
	}


	@Override
	public void send() {
		int r = sensor.readValue();
		System.out.println("Sending over REST:"+r);
		
	}

}

