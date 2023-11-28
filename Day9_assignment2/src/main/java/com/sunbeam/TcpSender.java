package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TcpSender implements ReadingSender {
	@Qualifier("humditySensor")
	
	private Sensor sensor;

	@Autowired
	public TcpSender(Sensor sensor) {
		
			this.sensor = sensor;
		}
	public void send()
	{
		int r=sensor.readValue();
		System.out.println("Sending over TCP:" + r);
	}
	
	

}
