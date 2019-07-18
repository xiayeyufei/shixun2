package day6.URl;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class TestUrl {
	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL("http://baidu.com");
		//?后面是参数
		URL url2=new URL(url,"/index.html?username=mary");
		System.out.println();
	}
}
