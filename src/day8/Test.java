package day8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
public static void main(String[] args) {
	Hero h=new Hero();
	h.name="lisa";
	System.out.println(h.name);
	try {
		Class pClass=Class.forName("day8.Hero");
		Constructor c=pClass.getConstructor();
		Hero h1=(Hero)c.newInstance();//通过该构造方法利用指定参数创建一个该类的对象，未设置形参则默认无参构造方法
		h1.name="bad";
		System.out.println(h1.name);
		
	} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	
}
}
