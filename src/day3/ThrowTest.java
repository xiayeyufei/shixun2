package day3;

import java.io.File;
import java.io.IOException;

public class ThrowTest{/*
如果一个方法中的语句
执行时可能生成某种异常，
但是并不能确定如何处理，
则可以在程序所在的函数声明后，
使用throws关键字抛出异常
*/
		public void createFile(String path) throws IOException{
			File f= new File(path);
			f.createNewFile();
		}
		public static void main(String[] args){
			ThrowTest  tt = new ThrowTest();
			try{
				tt.createFile("D:/abc.txt");
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}


