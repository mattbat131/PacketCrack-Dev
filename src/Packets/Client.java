package Packets;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import Threads.ThreadHandler;

public class Client extends ThreadHandler {

	private Socket server;
	private PrintWriter out;
	private BufferedReader stdIn, in;
	private String userInput;
	
	private String ip;
	
	public Client(String a) {
		ip = a;
	}
	
	@Override
	public void initialize() {
		try {
			
			server = new Socket(ip, 2040);
			
			out = new PrintWriter(server.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(
					server.getInputStream()));
			
			stdIn = new BufferedReader(new InputStreamReader(
					System.in));
			
			//server.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//stopProcess();
	}

	@Override
	public void iterate() {
		try {
			if ((userInput = stdIn.readLine()) != null) {
			    out.println(userInput);
			    System.out.println("echo: " + in.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub

	}

}
