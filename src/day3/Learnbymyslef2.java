package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Learnbymyslef2 {
	public static void main(String[] args) {
	File file1=new File("C:\\Users\\ASUS\\Desktop\\����\\axcsc.txt");
	try {
		FileInputStream fis1=new FileInputStream(file1);
		
		
	} catch (FileNotFoundException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
	
}
}
