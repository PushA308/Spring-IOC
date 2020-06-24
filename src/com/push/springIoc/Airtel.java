package com.push.springIoc;

public class Airtel implements Sim {

		
	@Override
	public void calling() {
		System.out.println("calling from Airtel sim");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet from Airtel sim");
		
	}

}
