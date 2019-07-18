package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test2 {
public static void main(String[] args) {
//	new Service1();
//	new Service2().doService();
	
	try {
		File f=new File("G:\\私人\\java\\workspace\\javashixun\\src\\abc.txt");
		Properties p=new Properties();
		p.load(new FileInputStream(f));
		String className=(String)p.get("class");
		String methodName=(String)p.get("method");
		Class clazz=Class.forName(className);
		Method m=clazz.getMethod(methodName);
		Constructor c=clazz.getConstructor();//获取构造器
		Object service=c.newInstance();//根据构造器实例化对象
		m.invoke(service);//调出对象指定方法
	} catch (FileNotFoundException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	} catch (Exception e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
}
}
