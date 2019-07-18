package day7.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CLient5 {
	public static void main(String[] args) {
		try {
			Socket socket=new Socket("127.0.0.1",8888);
			OutputStream os=socket.getOutputStream();
			PrintWriter pWriter=new PrintWriter(os);
			pWriter.write("用户名：annime，密码：1111");
			pWriter.flush();
			socket.shutdownInput();
			InputStream is=socket.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is)) ;
			String info="";
			while ((info=br.readLine())!=null) {
				System.out.println("我是客户端，服务器说："+info);
				
			}
			br.close();
			is.close();
			pWriter.close();
			
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
