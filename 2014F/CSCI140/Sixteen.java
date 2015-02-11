import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class Sixteen {

	//settings
	public static final int ServerPort = 9746;
	public static final String ServerIP = "localhost";
	public static final String EndOfMsg = "\n";
	public static final boolean No = true;
	
	//
	public static final Object Lock = new Object();
	public static int noCount = 0; //lock on Lock when accessing
	public static final int CountLimit = 2;
	
	//
	public static final List<Handle> handlesSynced = Collections.synchronizedList(new ArrayList<Handle>());
	
	public static void main(String[] args) throws IOException {
		System.out.println("Starting server");
		ServerSocket listener = new ServerSocket(ServerPort);
		try {
			Handle handle = null;
			while(getNoCount() < CountLimit) {
				Socket s = listener.accept();
				if(getNoCount() >= CountLimit) {
					PrintWriter out = new PrintWriter(s.getOutputStream(), true);
					out.print("Bye!"+EndOfMsg);
					s.close();
					break;
				}
				
				handle = new Sixteen.Handle(s);
				handle.start();
				handlesSynced.add(handle);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			listener.close();
		}
		
		//waiting for all outgoing connections to finish
		synchronized (handlesSynced) {
			Iterator<Handle> i = handlesSynced.iterator();
			while(i.hasNext()) {
				try {
					i.next().join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Server finished");
	}
	
	//noCount is accessed by multiple threads
	private static final int getNoCount() {
		synchronized (Lock) {
			return noCount;
		}
	}
	
	//noCount is accessed by multiple threads
	private static final void increaseNoCount() {
		synchronized (Lock) {
			noCount++;
		}
	}
	
	static private class Handle extends Thread {
		
		private final Socket s;
		
		public Handle(Socket s) {
			this.s = s;
			System.out.println("Created a new Handle: " + this);
		}
		
		public void run() {
			Random r = new Random();
			BufferedReader br = null;
			boolean type = !Sixteen.No;
			
			try {
				br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msg = br.readLine();
			
				try {
					sleep((r.nextInt(9)+1) * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				String response = "Yes";
				type = r.nextBoolean();
				if(type == Sixteen.No) {
					response = "No";
				}
				response += EndOfMsg;
				
				System.out.println(this + " get message [" + msg + "] and is sending ["+response+"]");
				s.getOutputStream().write(response.getBytes());
				s.close();
			
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				if(type == Sixteen.No) {
					increaseNoCount();
				}
			}
		}
		
	}
}
