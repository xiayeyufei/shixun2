package day3;

import java.io.File;
import java.io.IOException;

public class ThrowTest{/*
���һ�������е����
ִ��ʱ��������ĳ���쳣��
���ǲ�����ȷ����δ���
������ڳ������ڵĺ���������
ʹ��throws�ؼ����׳��쳣
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


