package day6.socketsever;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		try {
			Socket s1=new Socket("127.0.0.1",8888);
			System.out.println(s1);
			s1.close();
		}  catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
