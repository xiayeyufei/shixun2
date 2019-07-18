package day6.socketsever;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class Server1 {
	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(8888);
			System.out.println("8888");
			Socket socket=ss.accept();
			System.out.println("youlianjie   "+socket);
			socket.close();
			ss.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
