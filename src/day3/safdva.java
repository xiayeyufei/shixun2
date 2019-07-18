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
返回此抽象路径名表示的文件上次修改的时间。 */
		Date d =new Date(time);
		System.out.println("最后修改时间"+d);
		f.setLastModified(0);/*setLastModified(long time) 
设置由此抽象路径名命名的文件或目录的最后修改时间*/
		File fn=new File("D:/javafolder/javaok.exe");
		f.renameTo(fn);/*重命名由此抽象路径名表示的文件。*/
		try {
			fn.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		fn.delete();
	}
}
