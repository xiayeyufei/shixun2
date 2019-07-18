package javashixun;

import java.util.Scanner;


public class practice6 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		char[] items=String.valueOf(number).toCharArray();
		
		boolean flag=true;
		for(int i=0;i<items.length/2;i++) {
			if(items[i]==items[items.length-i-1]) {
				flag= true;
			}
			else {
				flag=false;
				break;
				
			}
	}System.out.println(flag);
	
		
	}
}
