package day3;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class safdva {
	public static void main(String[] args) {
		File f1=new File("D:/javafolder");
		System.out.println(f1.getAbsolutePath());
		File f2=new File("javaok.exe");
		System.out.println(f2.getAbsolutePath());
		File f3=new File(f1,"javaok.exe");
		System.out.println(f3.getAbsolutePath());
		File f=new File("D:/javafolder");
		System.out.println("dangqian"+f);
		System.out.println("exist"+f.exists());
		System.out.println("wenjianjia"+f.isDirectory());
		System.out.println("wenjian"+f.isFile());
		System.out.println("changdu"+f.length());
		long time=f.lastModified();/*lastModified() 
���ش˳���·������ʾ���ļ��ϴ��޸ĵ�ʱ�䡣 */
		Date d =new Date(time);
		System.out.println("����޸�ʱ��"+d);
		f.setLastModified(0);/*setLastModified(long time) 
�����ɴ˳���·�����������ļ���Ŀ¼������޸�ʱ��*/
		File fn=new File("D:/javafolder/javaok.exe");
		f.renameTo(fn);/*�������ɴ˳���·������ʾ���ļ���*/
		try {
			fn.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		fn.delete();
	}
}
