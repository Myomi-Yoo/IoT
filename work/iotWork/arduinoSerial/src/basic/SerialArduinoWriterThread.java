package basic;
//Ű����� �Է��ϴ� ���� �Ƶ��̳�� �������� ���� ������ - Serial

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SerialArduinoWriterThread extends Thread{
	InputStream is;
    InputStreamReader isr;
    BufferedReader br;
    
    Socket socket;
    ServerSocket server;
	
	OutputStream out;
	int llled;
	public SerialArduinoWriterThread(OutputStream out) {
		super();
		this.out = out;
	}
	public void run() {
		int ledstate=0;
		try {
			server = new ServerSocket(12345);
			socket = server.accept();
			is = socket.getInputStream();
			
			while(true) {
				ledstate = is.read();
				out.write(ledstate);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

