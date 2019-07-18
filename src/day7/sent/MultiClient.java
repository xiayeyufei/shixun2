package day7.sent;

import java.io.IOException;
import java.net.Socket;

public class MultiClient {
public static void main(String[] args) {
	try {
		Socket s=new Socket("127.0.0.1",8888);//创建流套接字并将其连接到指定IP地址的指定端口号。 
		new SendThread(s).start();
		new RecieveThread(s).start();
	} catch (IOException e) {
		// TODO: handle exception
	}
}
}
