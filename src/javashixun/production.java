package javashixun;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class production {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//��ʽ��
Scanner in =new Scanner(System.in);
Date productDay;
try {
	productDay=sdf.parse(in.next());//����ʽ�����ַ���ת�������ڶ���
	System.out.println("�����뱣���ڣ� ");
	Scanner sc1=new Scanner(System.in);
	int release=sc1.nextInt();//����������
	Date nowdate=new Date();//��ȡ����ʱ��
	System.out.println("��������Ϊ"+sdf.format(nowdate));
	Calendar calendar=Calendar.getInstance();//Ĭ�ϵ�ǰ����
	calendar.setTime(productDay);//ʵ����ʾ��ʱ������������
	calendar.add(calendar.DATE,release);//�ӵ�ǰʱ��calandar��date����realese��ʱ��
	Date releasedate=calendar.getTime();//��ù���ʱ��
	long days=(releasedate.getTime()-nowdate.getTime())/(24*60*60*1000);
	if(days<0) {
		System.out.println("����Ʒ�ѹ���");
	}
	else {
		System.out.println("����"+days+"�����");
	}
} catch (Exception e) {
	// TODO: handle exception
}
	}
	

}
