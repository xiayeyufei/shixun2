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
					/*���ش��׽��ֵ�*****�����******
					������׽��־����������ͨ���������ɵ�������������в���ί�ɸ�ͨ����
		 			���ͨ�����ڷ�����ģʽ�����������write�������׳�IllegalBlockingModeException �� 
					�رշ��ص�OutputStream���ر���ص��׽��֡� 
					 	*/
			DataOutputStream dos =new DataOutputStream(os);//����һ���µ�������������Խ�����д��ָ���ĵײ��������  
					/*���������ʹӦ�ó����Ա�Яʽ��ʽ��ԭʼJava��������д���������
					 Ȼ��Ӧ�ó������ʹ����������������ȡ���ݡ�*/
			while(true) {
				Scanner sc=new Scanner(System.in);
				System.out.println("������:");
				String str=sc.next();
				dos.writeUTF(str);//ʹ�� modified UTF-8�����Ի����޹صķ�ʽ���ַ���д������������
                   				  //UTF��һ�ֱ���ϵͳ������Unicode���Ľ�
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}

}
