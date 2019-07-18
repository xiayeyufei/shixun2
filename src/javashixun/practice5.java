package javashixun;

import java.util.Scanner;
class mailtest{
	boolean testmail(){
		Scanner in=new Scanner(System.in);
		String mail=in.next();
		int a=-1;
		int b=-1;
		int c=-1;
		int d=-1;
		a=mail.indexOf('@');
		b=mail.indexOf('.');
		if(a!=-1&&a!=-1) {
			if(b<a) {
				return false;
			}
			else {
				int i=a+1;
				int j=b+1;
				c=mail.indexOf('@', i);
				d=mail.indexOf('.', j);
				if(c!=-1&&d!=-1) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		else {
			return false;
		}
	}
}
class mailtest2{
	boolean testmail2(){
		Scanner in=new Scanner(System.in);
		String mail=in.next();
		String pString="(\\w+)+@+(\\w+)+(\\.)+(\\w+)";
		if (mail.matches(pString)) {
			return true;
		} else {
			return false;

		}
	}
	
	
	
}
public class practice5 {
public static void main(String[] args) {
	mailtest2 mailtest2=new mailtest2();
	System.out.println(mailtest2.testmail2());
}
}
