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
class customer implements Serializable{//对象序列化     Serializable接口
/*支持序列化的接口和类
Serializable接口、Externalizable接口
ObjectInputStream
ObjectOutputStream
*/
	/**
	 * 表示这个类的当前版本
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
		/*写入文件对象*/
		FileOutputStream fos1=null;
		ObjectOutputStream oos1=null;
		/*ObjectOutputStream类继承OutputStream类，
		并实现了ObjectOutput接口。
		它负责向流写入对象
*/
		try {
			fos1=new FileOutputStream("D:/lol.txt");
			oos1=new ObjectOutputStream(fos1);
			customer c1=new customer("asdfv",12);
			customer c2=new customer("assd",18);
			System.out.println("duixiangxuliehua");
			oos1.writeObject(c1);
			/* writeObject(Object obj)
 			向指定的OutputStream中写入对象obj*/
			oos1.writeObject(c2);
			oos1.flush();//缓冲    flush()方法将使内存中的数据立刻写出
/*使用write方法输出数据时，有些数据并不会马上输出到我们指定的目的，通常会在内存中有个暂存区，
 * 有些输出的数据会暂时存放在这里，如果我们想要立刻把数据输出到目的地，
 * 不要放在暂存区中时，可以调用”flush”这个方法来对暂存区做清除的动作。
同样，数据输出完后，记得把它”close”，
在调用close这个方法时，
会先调用flush这个方法，
以确保所有的数据都已经输出到目的地了。
*/
			
			
		} catch ( IOException e) {
			// TODO 自动生成的 catch 块
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
		}/*下面是从文件中读取对象*/
		FileInputStream ois1=null;
		ObjectInputStream oos2=null;
		Object c3=null;
		
		try {
			ois1=new FileInputStream("D:/lol.txt");
			oos2=new ObjectInputStream(ois1);
			while((c3=oos2.readObject())!=null) {/* 
			readObject(Object obj)
 			从指定的InputStream中读取对象
*/
				customer c4=(customer)c3;//读的是对象，不是字符串。（否则会报强制类型转换错误）
				System.out.println(c4.getAge()+"  "+c4.getName());
		} 
		
		}catch (EOFException e) {
		
			System.out.println("读取完毕");
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
