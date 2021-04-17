package com.question12;

public class DaemonThread9 extends Thread{
	public static void main(String[] args) {
		DaemonThread9 thread1=new DaemonThread9();
		DaemonThread9 thread2=new DaemonThread9();
		DaemonThread9 thread3=new DaemonThread9();
		thread1.start();
		thread2.setDaemon(true);
		thread2.start();
		thread3.start();
	}
	public void run() {
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread Will Work");
		}
		else
		{
			System.out.println("User Thread is Running");
		}
	}
}
