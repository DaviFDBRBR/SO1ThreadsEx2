package controller;

public class ThreadPrint extends Thread{
	private long id;
	
	public ThreadPrint() {
		this.id = getId();
	}
	
	@Override
	public void run() {
		System.out.println(id);
		super.run();
	}
	
}
