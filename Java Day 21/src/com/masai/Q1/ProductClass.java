package com.masai.Q1;

public class ProductClass implements Runnable{

	int product = 1;
	
	@Override
	public void run() {
		System.out.println("Inside: " + Thread.currentThread().getName());
		for(int i=1;i<=10;i++) {
			
			product *= i;
		}
		
	}
	
	
}
