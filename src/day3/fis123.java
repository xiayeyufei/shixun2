package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.print.attribute.standard.MediaName;

public class fis123
{
	public static void main(String[] args) {
		File f=new File("D:/lol.txt");
		try {
			f.createNewFile();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		
		try {
			FileInputStream fill=new FileInputStream(f);
			byte[] bs=new byte[(int)f.length()];
			fill.read(bs);
			for(byte byt:bs) {
				System.out.println(byt);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
			// TODO: handle exception
			
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
