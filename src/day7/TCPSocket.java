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
		OutputStream oi=sd.getOutputStream();//打开输出流
		oi.write(2415);//写入数字
		oi.flush();
		iss.close();

	} catch (UnknownHostException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	} catch (IOException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
}
}
