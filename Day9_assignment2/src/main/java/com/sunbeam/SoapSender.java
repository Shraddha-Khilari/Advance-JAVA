package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoapSender implements ReadingSender {
	
	@Qualifier("tempSensor")
	private Sensor sensor;

	@Autowired
	public SoapSender() {
		
}

	public void send()
	{
		int r = sensor.readValue();

		System.out.println("Sending over SOAP:"+ r);
	}

}
