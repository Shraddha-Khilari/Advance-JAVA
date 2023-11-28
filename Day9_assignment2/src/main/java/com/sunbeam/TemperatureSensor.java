package com.sunbeam;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class TemperatureSensor  implements Sensor
{
	public int readValue()
	{
		return  (int) (Math.random()*21)+10;
	}
}

