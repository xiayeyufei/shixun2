package day7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client3 {
public static void main(String[] args) {
	try {
		Socket socket=new Socket("127.0.0.1",8888);
		OutputStream ssd=socket.getOutputStream();
		DataOutputStream dos1=new DataOutputStream(ssd);
		dos1.writeUTF("hello,sever");
		BufferedOutputStream boStream=new BufferedOutputStream(dos1);
		dos1.flush();
		dos1.close();
		ssd.close();
		socket.close();
		
	} catch (UnknownHostException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	} catch (IOException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	
}
}
