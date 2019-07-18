package day8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	public static void printClassMethodMessage(Object obj) {
		Class c=obj.getClass();
		System.out.println("类的名称"+c.getName());
		Method[] ms =c.getMethods();//获取的是所有public的函数，包括父类继承来的
		/*getDeclaredMethods()获取的是所有该类自己声明的方法，
		 * 不问访问权限（包括共有和私有，不包括从父类继承的方法）
		 */
		for (int i = 0; i < ms.length; i++) {
			Class retrunType=ms[i].getReturnType();//通过循环得到方法的返回值类型的类类型
			System.out.println("返回类型值："+retrunType.getName());
			System.out.println("方法名称 "+ms[i].getName());//得到方法的名称
			Class[] paramType=ms[i].getParameterTypes();//获取参数类型-->通过循环得到的是参数列表的类型的类类型
			for(Class class1:paramType) {
				System.out.println(class1.getName()+",");
			}
			
		}
	}
	
public static void printClassFieldMessage(Object obj) {
	Class s=obj.getClass();
	Field[] fs=s.getDeclaredFields();
	for (Field field:fs) {
		Class fieldType=field.getType();
		String typeName=fieldType.getName();
		String fieldName=field.getName();
		System.out.println("成员变量类型"+typeName);
		System.out.println("成员变量的名称"+fieldName);
		
	}
	
}
public static void printClassConstructorMessage(Object obj) {
	Class s=obj.getClass();
	Constructor[] cs = s.getConstructors();
	Constructor[] cs2 = s.getDeclaredConstructors();
	for (int i = 0; i < cs.length; i++) {
		System.out.println("获取所有public的构造函数"+cs[i].getName());
		Class[] paramType = cs[i]. getParameterTypes();
		for (int j = 0; j < paramType.length; j++) {
			System.out.println("参数列表的类类型"+paramType[j].getName());
			
		}
		

		
	}

}
}
