package day6.homework4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Thread{
	public static void main(String[] args) {
		
		
		SimpleDateFormat sttDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		while (true) {
			Date ddDate=new Date();
			System.out.println(sttDateFormat.format(ddDate));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
