package hangman;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client{

	private String address;
	private int port;

	public Client(String address, int port) {
		// TODO Auto-generated constructor stub
<<<<<<< HEAD
		/*this.address = address;
		this.port = port;*/

		Window w1 = new Window(300,300);
		LogicClient l1 = new LogicClient();
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(l1);
		t1.start();
		t2.start();
		
		/*try {
=======
		this.address = address;
		this.port = port;
	
	try {
>>>>>>> Server
		Socket socket = new Socket(address,port);
		socket.setSoTimeout(10000);
		PrintWriter wr = new PrintWriter(socket.getOutputStream());
		wr.println("newgame");
		wr.flush();
		socket.close();

	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
<<<<<<< HEAD
	}*/

=======
	}
	
>>>>>>> Server
	}


}
