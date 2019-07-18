package day6.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
public static void main(String[] args) {
	try {
		InetAddress address=InetAddress.getLocalHost();
		System.out.println("jiansuanji="+address.getHostName());
		System.out.println("IP="+address.getHostAddress());
		byte[] bytes=address.getAddress();
		System.out.println(address);
		InetAddress address2=InetAddress.getByName("DESKTOP-SDMPT9S");
		System.out.println("jiansuanji="+address2.getHostName());
		System.out.println("IP="+address2.getHostAddress());
	} catch (UnknownHostException e) {
		// TODO: handle exception
	}
}
}
