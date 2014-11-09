package Main;

import java.util.ArrayList; 

import Packets.Server;
import Packets.Client;
import Threads.*;

public class Main{	
	public static ArrayList<ThreadHandler> threads = new ArrayList<ThreadHandler>();
	
	public static void main(String[] args) {
		createThreads();
		startThreads();
	}
	
	public static void createThreads() {
		Server send = new Server();
		Client intercept = new Client("localhost");
		threads.add(send);
		threads.add(intercept);
	}

	public static void startThreads() {
		for (ThreadHandler th : threads) {
			th.start();
		}
		
	}

	public static void stopThreads() {
		for (ThreadHandler th : threads) {
			th.stopProcess();
		}
	}

	public static void createThread(ThreadHandler th) {
		//th.add();
		
	}

	public static void startThread(ThreadHandler th) {
		th.start();
	}

	public static void stopThread(ThreadHandler th) {
		th.stopProcess();
	}
	
}
