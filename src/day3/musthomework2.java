package day3;

import java.util.Scanner;

public class musthomework2 {
	public static void compare(String a,String b) throws NullPointerException{
		int c=a.compareTo(b);
		if (a==null||b==null) {
			throw new NullPointerException();
		} else {

		}
		if (c>0) {
			System.out.println("ada");
			
		}
		else {
			System.out.println("bda");
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		String b=in.nextLine();
		try {
			compare(a,b);
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("¿Õ×Ö·û´®");
		}
		
	}

}
