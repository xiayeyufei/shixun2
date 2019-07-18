package day7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class sevice {
public static void main(String[] args) {
	ServerSocket ss;
	try {
		ss = new ServerSocket(8888);
		System.out.println("8888");
		Socket s=ss.accept();
		InputStream ip=s.getInputStream();
		InputStreamReader isr=new InputStreamReader(s.getInputStream());
		BufferedReader bReader=new BufferedReader(isr);
		int msg =ip.read();
		int aString=isr.read();
		System.out.println("listen"+msg+"    "+aString);
		ip.close();
		s.close();
		ss.close();
	} catch (IOException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	
}
}
