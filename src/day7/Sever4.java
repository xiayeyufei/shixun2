package day7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever4 {
	public static void main(String[] args) {
		try {
			ServerSocket ss1=new ServerSocket(8888);
			System.out.println("-----����������-----");
			Socket s1=ss1.accept();
			System.out.println("ip"+s1.getInetAddress()+":"+s1.getLocalPort());/*getInetAddress()�����׽��������ӵĵ�ַ��*/
			BufferedReader bReader =new BufferedReader(new InputStreamReader(s1.getInputStream()));
			String string =bReader.readLine();
			System.out.println(string);
			s1.close();
			ss1.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
}
