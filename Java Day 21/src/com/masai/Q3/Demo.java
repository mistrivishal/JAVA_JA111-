package com.masai.Q3;

public class Demo {
	
//	3) Write the fun1() method of Common class using synchronized block 
//	   to get the Class level lock. (You problem from notes)
	
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + " thread is started\n");
		
		Common c1 = new Common();
		Common c2 = new Common();
		
		Thread t1 = new Thread(c1,"C1-Thread");
		Thread t2 = new Thread(c2,"C2-Thread");
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		System.out.println("\n"+Thread.currentThread().getName() + " is ends\n");
		
	}
}
