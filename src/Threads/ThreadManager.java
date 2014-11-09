package Threads;

import java.util.ArrayList;

public interface ThreadManager {
	public static ArrayList<ThreadHandler> threads = new ArrayList<ThreadHandler>();
	
	public void createThreads();
	public void startThreads();
	public void stopThreads();
	
	public void createThread(ThreadHandler th);
	public void startThread(ThreadHandler th);
	public void stopThread(ThreadHandler th);
}
