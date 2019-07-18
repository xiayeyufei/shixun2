package javashixun;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class practise4 {
public static void main(String[] args) {
	
	try {
		SimpleDateFormat st=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("请输入北京时间yyyy-MM-dd HH:mm:ss");
		Scanner in=new Scanner(System.in);
		Date BJT=st.parse(in.next());
		Calendar FCT=Calendar.getInstance();
		FCT.setTime(BJT);
		FCT.add(FCT.HOUR, 7);
		Calendar NYT=Calendar.getInstance();
		NYT.setTime(BJT);
		NYT.add(NYT.HOUR, 12);
		System.out.println(NYT.getTime()+" "+FCT.getTime());
	} catch (ParseException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	
}
}
