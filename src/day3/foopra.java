package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class foopra {
	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("D:/lol2.txt");
		
		try {
			file.createNewFile();/*���ҽ��������ھ��д˳���·����ָ�������Ƶ��ļ�ʱ��ԭ�ӵش����ɴ˳���·����ָ����һ���µĿ��ļ���
������booleanֵ*/
			FileOutputStream aaa=new FileOutputStream(file);
			byte data[]= {88,89};
			aaa.write(data);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
