package com.masai.Q4;

public class Mian {

//	4) Explain wait(), notify(),notifyAll() how they are used for inter thread communication.

//	Above methods are used to communicate  between any two threads in the java;
//	Above methods are the present in the Object class;
//	To get the partial control over the scheduling process which are supervised by the thread-scheduler;
	
//	1. wait():- 
//	   this wait() method is used to release the lock of the object own by the current thread until when 
//	   the another methods calls the notify() method;
//	   wait() only called from the synchronized method and that current thread should own object lock;

//	2. notify():-
//	   Whenever one methods is suspended using the wait() method to resume that thread notify() method is used
//	   by which the another thread(single thread) which is waiting to enter the and execute the current object 
//	   lock will be notified and awakened.

//	3. notifyAll():-
//	   Works same as the notify() method but difference is that it will notifies all the threads which are waiting

	public static void main(String[] args) {

		InterThreadCummunication i1 = new InterThreadCummunication();
		
		Thread t1 = new Thread(i1,"Thread i1");
		
		
		t1.start();
		
		synchronized (t1) {
			try {
				t1.wait();
				System.out.println(Thread.currentThread().getName()+" thread waiting...");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			System.out.println(Thread.currentThread().getName()+ " thread got the notification");
		}
		
	}
}
