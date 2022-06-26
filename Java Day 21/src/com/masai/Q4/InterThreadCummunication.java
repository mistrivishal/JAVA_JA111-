package com.masai.Q4;

public class InterThreadCummunication implements Runnable{

	@Override
	public void run() {
		
		synchronized (this) {
			
			System.out.println(Thread.currentThread().getName() + " is entered\n");
			
			for(int i=0;i<=2;i++) {
				System.out.println(Thread.currentThread().getName() + " is running");
				
			}
			
			System.out.println("\n"+Thread.currentThread().getName() + " is ends\n");
			
			
			System.out.println("\n"+Thread.currentThread().getName() + " is giving notification\n");
			
			this.notify();
		}
	}
	
	
}
