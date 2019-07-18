package day7;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever3 {
	public static void main(String[] args) {
		try {
			ServerSocket ss1=new ServerSocket(8888);
			Socket socket1=ss1.accept();
			DataInputStream dis1=new DataInputStream(socket1.getInputStream());
			System.out.println(dis1.readUTF());
			System.out.println("hello client "+ss1.getInetAddress()+":"+socket1.getLocalPort());
			dis1.close();
			socket1.close();
			ss1.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
