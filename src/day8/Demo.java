package day8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.ws.spi.Invoker;

public class Demo {
	public static void main(String[] args) {
//		String str = "helloworld";
//
//		Class clazz = str.getClass();
//
//		Method m;
//		try {
//			m = clazz.getMethod("substring", int.class);
//			Object o = m.invoke(str, 4);
//
//			System.out.println(o);
//		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
//			// TODO �Զ����ɵ� catch ��
//			e.printStackTrace();
//		}

		try {
			Hero h=new Hero();
			
			Method mm= h.getClass().getMethod("setName",String.class);
			mm.invoke(h, "lisa");
			System.out.println(h.getName());
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		

	}
}
