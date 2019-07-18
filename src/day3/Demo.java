package day3;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class customer implements Serializable{//�������л�     Serializable�ӿ�
/*֧�����л��Ľӿں���
Serializable�ӿڡ�Externalizable�ӿ�
ObjectInputStream
ObjectOutputStream
*/
	/**
	 * ��ʾ�����ĵ�ǰ�汾
	 */
	private static final long serialVersionUID = 4818759477630036606L;

	private String name ;
	
	private int age;
	public customer(String name,int age) {
		
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "name="+name+"    age="+age;
	}
	
}

public class Demo {
	public static void main(String[] args) {
		/*д���ļ�����*/
		FileOutputStream fos1=null;
		ObjectOutputStream oos1=null;
		/*ObjectOutputStream��̳�OutputStream�࣬
		��ʵ����ObjectOutput�ӿڡ�
		����������д�����
*/
		try {
			fos1=new FileOutputStream("D:/lol.txt");
			oos1=new ObjectOutputStream(fos1);
			customer c1=new customer("asdfv",12);
			customer c2=new customer("assd",18);
			System.out.println("duixiangxuliehua");
			oos1.writeObject(c1);
			/* writeObject(Object obj)
 			��ָ����OutputStream��д�����obj*/
			oos1.writeObject(c2);
			oos1.flush();//����    flush()������ʹ�ڴ��е���������д��
/*ʹ��write�����������ʱ����Щ���ݲ������������������ָ����Ŀ�ģ�ͨ�������ڴ����и��ݴ�����
 * ��Щ��������ݻ���ʱ�����������������Ҫ���̰����������Ŀ�ĵأ�
 * ��Ҫ�����ݴ�����ʱ�����Ե��á�flush��������������ݴ���������Ķ�����
ͬ�������������󣬼ǵð�����close����
�ڵ���close�������ʱ��
���ȵ���flush���������
��ȷ�����е����ݶ��Ѿ������Ŀ�ĵ��ˡ�
*/
			
			
		} catch ( IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally {
			try {
				if(null!=fos1) {
					fos1.close();
				}
				if(null!=oos1) {
					oos1.close();
				}
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}/*�����Ǵ��ļ��ж�ȡ����*/
		FileInputStream ois1=null;
		ObjectInputStream oos2=null;
		Object c3=null;
		
		try {
			ois1=new FileInputStream("D:/lol.txt");
			oos2=new ObjectInputStream(ois1);
			while((c3=oos2.readObject())!=null) {/* 
			readObject(Object obj)
 			��ָ����InputStream�ж�ȡ����
*/
				customer c4=(customer)c3;//�����Ƕ��󣬲����ַ�����������ᱨǿ������ת������
				System.out.println(c4.getAge()+"  "+c4.getName());
		} 
		
		}catch (EOFException e) {
		
			System.out.println("��ȡ���");
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
