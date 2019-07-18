package day3;

import java.io.File;

public class pra1 {
	public static void main(String[] args) {
		File f2=new File("C:/WINDOWS");
		File[] a=f2.listFiles();/*listFiles() 
返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。 */
		long maxnumber=0;
		long minnumber=Integer.MAX_VALUE;
		File maxfile=null;
		File minfile=null;
		
		for(File life :a) {
			if(life.isFile()) {//判断是否为文件
				if(life.length()>maxnumber) {
					maxnumber=life.length();
					maxfile=life;
					}
				if(life.length()!=0&&life.length()<minnumber) {
					minnumber=life.length();
					minfile=life;
				}
			}
		}
		System.out.println("最大文件  "+maxfile.getName()+"\t大小  \t"+maxnumber);
		System.out.println("最小文件  "+minfile.getName()+"\t大小  \t"+minnumber);
		System.out.println(minfile.getPath());
		
	}
}
