package day7.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread{
	Socket socket=null;
	public ServerThread(Socket socket) {
		// TODO 自动生成的构造函数存根
		this .socket=socket;
	}
	public void run() {
		InputStream iS =null;
		InputStreamReader isr =null;
		BufferedReader bR=null;
		OutputStream os=null;
		PrintWriter pw=null;
		try {
			iS=socket.getInputStream();
			isr=new InputStreamReader(iS);
			bR=new BufferedReader(isr);
			String infoString="";
			while ((infoString=bR.readLine())!=null) {
				System.out.println("我是服务器，客户端说："+infoString);
				
				
			}
			socket.shutdownInput();
			os=socket.getOutputStream();
			pw=new PrintWriter(os);
			pw.write("欢迎您");
			pw.flush();
		} catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				if(null!=pw) {
					pw.close();
				}
				if(null!=os) {
					os.close();
				}
				if(null!=bR) {
					bR.close();
				}
				if(null!=isr) {
					isr.close();
				}
				if(null!=bR) {
					bR.close();
				}
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
	}
}
