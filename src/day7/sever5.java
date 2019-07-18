package day7;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import day7.practice.ServerThread;

public class sever5 {
	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(8888);
			int count =0;
			System.out.println("----服务器即将启动，等待客户连接-------");
			while (true) {
				Socket s=ss.accept();
				ServerThread sT=new ServerThread(s);
				sT.start();
				count++;
				System.out.println("客户端数量："+count);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
