package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class fffpra5 {
	public static void main(String[] args) throws FileNotFoundException {
		File file =new File("D:/lol.txt");
		try {
			FileReader fsdf=new FileReader(file);
			char[] c=new char[(int)file.length()];
			fsdf.read(c);
			System.out.println(c);
			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		try {
			FileWriter wwWriter=new FileWriter(file);
			wwWriter.write("fuckyou");
			wwWriter.close();
			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
		
		}	}
}
