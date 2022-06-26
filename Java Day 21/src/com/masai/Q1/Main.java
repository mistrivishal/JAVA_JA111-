package com.masai.Q1;

public class Main {
//	1)Make a thread that will calculate a product of 10 digits and another thread (main thread ) 
//	  will print the calculated value of the first thread.
	
	public static void main(String[] args) {
		
		ProductClass p1 = new ProductClass();
		
		Thread th1 =  new Thread(p1);
		
		th1.start();
		
		try {
			th1.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println( Thread.currentThread().getName() + " started");
		
		System.out.println("Product of first 10 natural numbers: " + p1.product);
		
	}
}
