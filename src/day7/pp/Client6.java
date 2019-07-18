package day7.pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client6 {
	public static void main(String[] args) {
		Socket s=null;
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
			s=new Socket("127.0.0.1",8888);
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			while(true) {
				Scanner sc=new Scanner(System.in) ;
				System.out.println("客户端：");
				String str=sc.nextLine();
				pw.println();
				if(str.equals("exit")) {
					break;
				}
				String msg=br.readLine();
				System.out.println("接收服务器数据"+msg);
				pw.close();
				br.close();
				s.close();
				
			}
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null!=s) {
					s.close();
				}
				if(null!=pw) {
					s.close();
				}
				if(null!=s) {
					s.close();
				}
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
	}
}
