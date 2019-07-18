package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class foopra {
	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("D:/lol2.txt");
		
		try {
			file.createNewFile();/*当且仅当不存在具有此抽象路径名指定的名称的文件时，原子地创建由此抽象路径名指定的一个新的空文件。
并返回boolean值*/
			FileOutputStream aaa=new FileOutputStream(file);
			byte data[]= {88,89};
			aaa.write(data);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
