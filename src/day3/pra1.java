package day3;

import java.io.File;

public class pra1 {
	public static void main(String[] args) {
		File f2=new File("C:/WINDOWS");
		File[] a=f2.listFiles();/*listFiles() 
����һ������·�������飬��ʾ�ɸó���·������ʾ��Ŀ¼�е��ļ��� */
		long maxnumber=0;
		long minnumber=Integer.MAX_VALUE;
		File maxfile=null;
		File minfile=null;
		
		for(File life :a) {
			if(life.isFile()) {//�ж��Ƿ�Ϊ�ļ�
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
		System.out.println("����ļ�  "+maxfile.getName()+"\t��С  \t"+maxnumber);
		System.out.println("��С�ļ�  "+minfile.getName()+"\t��С  \t"+minnumber);
		System.out.println(minfile.getPath());
		
	}
}
