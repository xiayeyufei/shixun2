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
		Hero h1=(Hero)c.newInstance();//ͨ���ù��췽������ָ����������һ������Ķ���δ�����β���Ĭ���޲ι��췽��
		h1.name="bad";
		System.out.println(h1.name);
		
	} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
	
}
}
