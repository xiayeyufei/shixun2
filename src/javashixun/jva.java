package javashixun;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class jva {
	
public static void main(String[] args) {
	/*System.out.println(Character.isLetter('s'));//�ǲ�����ĸ
	System.out.println(Character.isDigit('s'));//�ǲ�������
	System.out.println(Character.isWhitespace(' '));//�ǲ��ǿո�
	int a1=10;
	int a2=10;
	System.out.println(a1==a2);
	Integer b1=10;
	Integer b2=10;
	System.out.println(b1 == b2);
	Integer c1 = new Integer(10);
	Integer c2 = new Integer(10);
	System.out.println(c1 == c2);
	System.out.println(c1.equals(c2));
	String str1="david";
	String str2=new String("angle");
	char[] cs=new char[] {'��','��','��'};
	String str3=new String(cs);
	String str4=new String(cs,1,2);
	System.out.println(str1+" "+str2+" "+str3+" "+str4+" ");
	//david angle ������ ���� 
	System.out.println(5+6+'A');
	System.out.println(5+6+"A");
	System.out.println(5+"A"+6);*/
/*76
11A
5A6*/
	  
	  /*String sx=new Scanner(System.in).next();;
	  System.out.println(sx.substring(0, 3)+"****"+sx.substring(7));
	  
	  System.out.println();*/
	/*float f1=4.1f;
	float f2=4.8f;
	System.out.println(Math.abs(f1));
	System.out.println(Math.min(f1, f2));
	System.out.println(Math.PI);
	System.out.println(Math.E);
	System.out.println(Math.floor(f1));
	System.out.println(Math.floor(f2));
	System.out.println(Math.ceil(f1));
	System.out.println(Math.round(f1));
	System.out.println(Math.random());
	System.out.println(Math.sqrt(9));
	System.out.println(Math.pow(2, 4));*/
	  /*4.1
	4.1
	3.141592653589793
	2.718281828459045
	4.0
	4.0
	5.0
	4
	0.4230240335359935
	3.0
	16.0*/
	/*Scanner in=new Scanner(System.in);//�Ӽ�����������������Ϊ�����ε����ߣ�ʹ�ú��׹�ʽ����������ε������

	int a=in.nextInt();
	int b=in.nextInt();
	int c=in.nextInt();
	double p=((double)(a+b+c))/2;//p=(a+b+c)/2 ,һ��ҪС����

	double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
	System.out.println(p);
	System.out.println(s);*/
	//
	
String str1="2019-07-08 14:40:08";
String str2="2019-07-08 14:40:00";
Date maxDate=Max(str1, str2);
System.out.println(maxDate);
}

public static Date Max(String str1, String str2) {
	Date maxDate=null;
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	int result=str1.compareTo(str2);
	
	
	
		try {
			if(result>0) {
				maxDate=sdf.parse(str1);
			}
			else if(result<0) {
				maxDate=sdf.parse(str2);
			}
			else {
				maxDate=sdf.parse(str1);
			}
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	
	return maxDate;
}
}


