package Threads;

public abstract class ThreadHandler extends Thread{
	private volatile boolean end_process;
	
	public ThreadHandler() {
		end_process = false;
	}
	
	public void run() {
		initialize();
		while(!end_process) {
			iterate();
		}
	}
	
	public void stopProcess() {
		end_process = true;
		end();
		interrupt();
	}
	
	public abstract void initialize();
	public abstract void iterate();
	public abstract void end();

}
