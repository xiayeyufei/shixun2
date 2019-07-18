package day8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	public static void printClassMethodMessage(Object obj) {
		Class c=obj.getClass();
		System.out.println("�������"+c.getName());
		Method[] ms =c.getMethods();//��ȡ��������public�ĺ�������������̳�����
		/*getDeclaredMethods()��ȡ�������и����Լ������ķ�����
		 * ���ʷ���Ȩ�ޣ��������к�˽�У��������Ӹ���̳еķ�����
		 */
		for (int i = 0; i < ms.length; i++) {
			Class retrunType=ms[i].getReturnType();//ͨ��ѭ���õ������ķ���ֵ���͵�������
			System.out.println("��������ֵ��"+retrunType.getName());
			System.out.println("�������� "+ms[i].getName());//�õ�����������
			Class[] paramType=ms[i].getParameterTypes();//��ȡ��������-->ͨ��ѭ���õ����ǲ����б�����͵�������
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
		System.out.println("��Ա��������"+typeName);
		System.out.println("��Ա����������"+fieldName);
		
	}
	
}
public static void printClassConstructorMessage(Object obj) {
	Class s=obj.getClass();
	Constructor[] cs = s.getConstructors();
	Constructor[] cs2 = s.getDeclaredConstructors();
	for (int i = 0; i < cs.length; i++) {
		System.out.println("��ȡ����public�Ĺ��캯��"+cs[i].getName());
		Class[] paramType = cs[i]. getParameterTypes();
		for (int j = 0; j < paramType.length; j++) {
			System.out.println("�����б��������"+paramType[j].getName());
			
		}
		

		
	}

}
}
