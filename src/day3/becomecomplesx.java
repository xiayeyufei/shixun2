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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
	/*public static void */
public static void main(String[] args) {
	/*
	 * �ļ�����
	 * ׼��һ���ı��ļ������а���ASCII����ַ��������ַ�
	 * void encodefile(file encoding ,file encoded
	 * �㷨�����ֲ���9��ԭ��֮�ϼ�һ��9Ϊ0
	 * ��ĸ�����ƶ�һ����z��a
	 * ����ĸ�Ȳ��䣬���Ĳ���
	 * ��һ�������㷨*/
	
}
}
