package day7.sent;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	public static void main(String[] args) {
		try {//创建绑定到指定端口的服务器套接字。 
			ServerSocket ss=new ServerSocket(8888);/*服务器实例化一个 ServerSocket 对象，表示通过服务器上的端口通信。*/
				/*这个类实现了服务器套接字。 
				服务器套接字等待通过网络进入的请求。 
				它根据该请求执行一些操作，
				然后可能将结果返回给请求者。 */
			System.out.println("监听在端口号8888");
			Socket s=ss.accept();		//侦听要连接到此套接字并接受它。 该方法将阻塞直到建立连接。
			/*服务器调用 ServerSocket 类的 accept() 方法，该方法将一直等待，直到客户端连接到服务器上给定的端口。*/
			new SendThread(s).start();
			new RecieveThread(s).start();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
