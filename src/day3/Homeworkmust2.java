package day3;

import java.util.Scanner;

public class Homeworkmust2 {
	static void compare(String str,String str2) throws NullPointerException {
			try {
				str.compareTo(str2);
			} catch (Exception e) {
				throw e;
			}
			
	  }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in) ;
		String str1=in.nextLine();
		String str2=in.nextLine();
		try {
			compare(str1, str2);
		} catch (NullPointerException e)
		{
			e.printStackTrace();
		}
	}
}
