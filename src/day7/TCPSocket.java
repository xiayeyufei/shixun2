package day7;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.attribute.DosFileAttributes;

import javax.xml.crypto.Data;

public class TCPSocket {
public static void main(String[] args) {
	
	try {
		Socket sd=new Socket("127.0.0.1",8888);
		
		
		InputStream iss=sd.getInputStream();
		OutputStream oi=sd.getOutputStream();//�������
		oi.write(2415);//д������
		oi.flush();
		iss.close();

	} catch (UnknownHostException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	} catch (IOException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
}
}
