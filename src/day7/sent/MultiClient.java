package day7.sent;

import java.io.IOException;
import java.net.Socket;

public class MultiClient {
public static void main(String[] args) {
	try {
		Socket s=new Socket("127.0.0.1",8888);//�������׽��ֲ��������ӵ�ָ��IP��ַ��ָ���˿ںš� 
		new SendThread(s).start();
		new RecieveThread(s).start();
	} catch (IOException e) {
		// TODO: handle exception
	}
}
}
