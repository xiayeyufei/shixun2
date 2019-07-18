package day7.pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServiceThread implements Runnable{
	Socket s;
	public ServiceThread(Socket s){
		this.s=s;
	}
	public void run() {
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
		br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
		while (true) {
			String str=br.readLine();
			if(str.equals("exit")) {
				break;
			}
			System.out.println("接收客户端数据："+str);
			System.out.println("服务器端： ");
			Scanner sc=new Scanner(System.in);
			String serverstr=sc.nextLine();
			pw.println();
			
		}
		
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null!=pw) {
					pw.close();
					}
					if(null!=br) {
						br.close();
					}
				
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
	
