package day3;

import java.util.Scanner;

public class Homeworkmust {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	try {
		String a=in.nextLine();
		String b=in.nextLine();
		int c1=Integer.parseInt(a);
		int c2=Integer.parseInt(b);
		System.out.println(c1/c2);
		/*ArrayIndexOutOfBoundsException 	�����±���� */
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	catch (ArithmeticException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("������");
		e.printStackTrace();
	}
	finally {
		System.out.println("�ܱ�ִ��");
	}
}
}
