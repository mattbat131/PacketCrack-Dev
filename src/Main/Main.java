package Main;

import Packets.Intercept;
import Threads.*;

public class Main implements ThreadManager{	
	public static void main(String[] args) {
		((ThreadManager) threads).createThreads();
		((ThreadManager) threads).startThreads();
	}
	
	@Override
	public void createThreads() {
		Intercept intercept = new Intercept();
		threads.add(intercept);
	}

	@Override
	public void startThreads() {
		for (ThreadHandler th : threads) {
			th.start();
		}
		
	}

	@Override
	public void stopThreads() {
		for (ThreadHandler th : threads) {
			th.stopProcess();
		}
	}

	@Override
	public void createThread(ThreadHandler th) {
		//th.add();
		
	}

	@Override
	public void startThread(ThreadHandler th) {
		th.start();
	}

	@Override
	public void stopThread(ThreadHandler th) {
		th.stopProcess();
	}
	
}
