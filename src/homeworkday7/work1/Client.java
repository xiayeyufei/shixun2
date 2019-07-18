package homeworkday7.work1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		OutputStream os=null;
		
		Scanner sc =new Scanner(System.in);
		InputStream is=null;
		InputStreamReader isr=null;
		
		try {
			
	
			
			Socket socket=new Socket("127.0.0.1",8888);
			os=socket.getOutputStream();
			PrintWriter pWriter=new PrintWriter(os);
			pWriter.write(sc.nextInt());
			pWriter.flush();
			socket.shutdownInput();
			is=socket.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is)) ;
			String info="";
			while ((info=br.readLine())!=null) {
				System.out.println(info);
				
			}
			br.close();
			is.close();
			pWriter.close();

			} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
