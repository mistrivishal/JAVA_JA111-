package com.masai.Q2;

public class A implements Runnable {

	int x;
	
	@Override
	public void run() {
	
		synchronized (this) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for(int i=0;i<15;i++) {
				System.out.println(Thread.currentThread().getName()+" "+this.x++ + " is crying.....");
			}
		} 
	}
	
	
}
