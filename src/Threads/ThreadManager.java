package Threads;

public interface ThreadManager {

	public void createThreads();
	public void startThreads();
	public void stopThreads();
	
	public void createThread(ThreadHandler th);
	public void startThread(ThreadHandler th);
	public void stopThread(ThreadHandler th);
}
