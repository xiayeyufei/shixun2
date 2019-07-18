package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class becomecomplesx {
	void encodefile(File before,File after) {
		try {
			FileReader fsdf=new FileReader(before);
			FileWriter fdd=new FileWriter(after);
			char[] c=new char[(int) before.length()];
			char[] ds=new char[(int) before.length()];
			fsdf.read(c);
			
			
			
		}catch ( IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	/*public static void */
public static void main(String[] args) {
	/*
	 * 文件加密
	 * 准备一个文本文件，其中包含ASCII吗的字符和中文字符
	 * void encodefile(file encoding ,file encoded
	 * 算法：数字不是9，原来之上加一，9为0
	 * 字母向右移动一个，z变a
	 * 非字母等不变，中文不变
	 * 加一个解谜算法*/
	
}
}
