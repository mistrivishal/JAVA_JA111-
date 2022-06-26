package com.masai.Q3;

public class Common implements Runnable{

	@Override
	public void run() {
		
		synchronized (Common.class) {
			
			System.out.println(Thread.currentThread().getName() + " is entered\n");
			
			for(int i=0;i<=5;i++) {
				try{
					Thread.sleep(500);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " is running");
				
			}
			
			System.out.println("\n"+Thread.currentThread().getName() + " is ends\n");
		}
		
	}
	
	
	
	
}
