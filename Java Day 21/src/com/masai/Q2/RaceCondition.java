package com.masai.Q2;

public class RaceCondition {
	
//	2) What is a race condition? 
//	ans:- Race condition is the condition where the two or more Threads are trying to access or sharing the data it will cause 
//		  the data manipulation;
//		  Ex.  When two threads are operating over the one variable the like incrementing or decrementing the value of variable
//			   simultaneously then there will be chance of incorrect data handling;  
	
	
//	How will you find and solve race condition show with proper running code ?
//	ans:- for example I created the class A which implementing the Runnable class and two threads are working on it simultaneously
//		  It will cause the race condition for counter that condition  we have to put Object level lock or class level lock
	
	
	public static void main(String[] args) {
		
		A a1 = new A();	
		
		Thread th1 = new Thread(a1);
		Thread th2 = new Thread(a1);
		
		th1.start();
		th2.start();
	
		
		
	}
}
