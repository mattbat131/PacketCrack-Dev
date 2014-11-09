package Packets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import Threads.ThreadHandler;

public class Server extends ThreadHandler{
	private ServerSocket client;
	private Socket user;
	private PrintWriter out;
	private BufferedReader in;
	
	@Override
	public void initialize() {
		try {
			client = new ServerSocket(2040);
			user = client.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void iterate() {
		try {
			out = new PrintWriter(user.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(user.getInputStream()));
			out.println("Because Fuck You");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

}
