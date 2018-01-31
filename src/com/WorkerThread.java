package com;


public class WorkerThread implements Runnable{
	
	private String command;
	public WorkerThread(String s){
		
		command=s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
       // processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
		
	}

}
