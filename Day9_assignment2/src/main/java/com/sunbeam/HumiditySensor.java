package com.sunbeam;



import org.springframework.stereotype.Component;

@Component
public class HumiditySensor implements Sensor
{
	public int readValue()
	{
		return  (int) (Math.random()*61)+40;
		
	}

}
