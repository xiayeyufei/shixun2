package day7.sent;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	public static void main(String[] args) {
		try {//�����󶨵�ָ���˿ڵķ������׽��֡� 
			ServerSocket ss=new ServerSocket(8888);/*������ʵ����һ�� ServerSocket ���󣬱�ʾͨ���������ϵĶ˿�ͨ�š�*/
				/*�����ʵ���˷������׽��֡� 
				�������׽��ֵȴ�ͨ�������������� 
				�����ݸ�����ִ��һЩ������
				Ȼ����ܽ�������ظ������ߡ� */
			System.out.println("�����ڶ˿ں�8888");
			Socket s=ss.accept();		//����Ҫ���ӵ����׽��ֲ��������� �÷���������ֱ���������ӡ�
			/*���������� ServerSocket ��� accept() �������÷�����һֱ�ȴ���ֱ���ͻ������ӵ��������ϸ����Ķ˿ڡ�*/
			new SendThread(s).start();
			new RecieveThread(s).start();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
