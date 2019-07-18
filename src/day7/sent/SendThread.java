package day7.sent;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread{
	private Socket s;
	public SendThread(Socket s) {
		this.s=s;
		
	}
	public void run() {
		OutputStream os;
		try {
			os = s.getOutputStream();
					/*返回此套接字的*****输出流******
					如果此套接字具有相关联的通道，则生成的输出流将其所有操作委派给通道。
		 			如果通道处于非阻塞模式，则输出流的write操作将抛出IllegalBlockingModeException 。 
					关闭返回的OutputStream将关闭相关的套接字。 
					 	*/
			DataOutputStream dos =new DataOutputStream(os);//创建一个新的数据输出流，以将数据写入指定的底层输出流。  
					/*数据输出流使应用程序以便携式方式将原始Java数据类型写入输出流。
					 然后应用程序可以使用数据输入流来读取数据。*/
			while(true) {
				Scanner sc=new Scanner(System.in);
				System.out.println("请输入:");
				String str=sc.next();
				dos.writeUTF(str);//使用 modified UTF-8编码以机器无关的方式将字符串写入基础输出流。
                   				  //UTF是一种编码系统，基于Unicode而改进
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}

}
