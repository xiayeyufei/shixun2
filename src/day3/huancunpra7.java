package day3;

import java.awt.event.FocusAdapter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public class huancunpra7 {
	public static void main(String[] args) {
		FileInputStream fls5=null;
		FileOutputStream fos=null;
		try {
			fls5 = new FileInputStream("D:/lol.txt");
			fos =new FileOutputStream("D:/lol2.txt");
			BufferedInputStream bls=new BufferedInputStream(fls5);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			int c= 0;
			while((c=bls.read())!=-1) {
				char ch=(char)c;
				bos.write(ch);
				
			}
			bos.flush();
		} catch ( IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally {
			try {
				fls5.close();
				fos.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
		
	}
}
