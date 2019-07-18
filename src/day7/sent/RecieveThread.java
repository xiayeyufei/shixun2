package day7.sent;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class RecieveThread extends Thread{
	private Socket s;
	public RecieveThread(Socket s) {
		this.s=s;
		
	}
	public void run() {
		InputStream is= null;
		DataInputStream dis = null;
		try {
			is=s.getInputStream();
			dis=new DataInputStream(is);
			while(true) {
				String msg=dis.readUTF();
				System.out.println("Ω” ’µΩ£∫"+msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				dis.close();
				is.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
