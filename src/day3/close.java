package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

public class close {
	public static void main(String[] args) {
		File f=new File("D:/lol.txt");
		try (FileInputStream ls=new FileInputStream(f)){
			byte[] b=new byte [(int)f.length()];
			ls.read(b);
			
		} catch ( IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
