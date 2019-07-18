package day7.pp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever6 {
	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(8888);
			while(true) {
				Socket s=ss.accept();
				ServiceThread st=new ServiceThread(s);
				Thread t=new Thread(st);
				t.start();
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
