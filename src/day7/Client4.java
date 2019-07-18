package day7;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client4 {
	public static void main(String[] args) {
		try {
			Socket s1=new Socket("127.0.0.1",8888);
			System.out.println(s1.getInetAddress().getLocalHost());
			System.out.println("bulid connect");
			Scanner scanner=new Scanner(System.in);
			String string =scanner.nextLine();
			BufferedWriter bw1=new BufferedWriter(new OutputStreamWriter(s1.getOutputStream()));
			bw1.write(string);
			bw1.flush();
			bw1.close();
			s1.close();
			
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
