package homeworkday7.work1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Service {
	
public static void main(String[] args) {
	InputStream iS =null;
	InputStreamReader isr =null;
	BufferedReader bR=null;
	OutputStream os=null;
	PrintWriter pw=null;
	try {
		ServerSocket ss=new ServerSocket(8888);
		Socket socket=ss.accept();
		iS=socket.getInputStream();
		isr=new InputStreamReader(iS);
		bR=new BufferedReader(isr);
		String [] arr = bR.readLine().split("\\s+");
		Arrays.sort(arr);
		String a=arr.toString();
		socket.shutdownInput();
		os=socket.getOutputStream();
		pw=new PrintWriter(os);
		pw.write(a);
		pw.flush();
		} catch (IOException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	
}
}
