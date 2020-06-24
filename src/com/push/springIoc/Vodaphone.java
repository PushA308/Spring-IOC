package com.push.springIoc;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		System.out.println("calling from Vodaphone sim");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet from Vodaphone sim");
		
	}

}
