package javashixun;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class production {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//格式化
Scanner in =new Scanner(System.in);
Date productDay;
try {
	productDay=sdf.parse(in.next());//将格式化的字符串转化成日期对象
	System.out.println("请输入保质期： ");
	Scanner sc1=new Scanner(System.in);
	int release=sc1.nextInt();//保质期天数
	Date nowdate=new Date();//获取现在时间
	System.out.println("今天日期为"+sdf.format(nowdate));
	Calendar calendar=Calendar.getInstance();//默认当前日期
	calendar.setTime(productDay);//实例表示的时间变成生产日期
	calendar.add(calendar.DATE,release);//从当前时间calandar。date加上realese的时间
	Date releasedate=calendar.getTime();//获得过期时间
	long days=(releasedate.getTime()-nowdate.getTime())/(24*60*60*1000);
	if(days<0) {
		System.out.println("该商品已过期");
	}
	else {
		System.out.println("还有"+days+"天过期");
	}
} catch (Exception e) {
	// TODO: handle exception
}
	}
	

}
