

import javax.management.RuntimeErrorException;


public class classpra7{
public static void main(String[] args) {
	try {
		badmethod();
		System.out.println("a");
	} catch (RuntimeException e) {
		System.out.println("b");
		
	}
	catch (Exception e1) {
		System.out.println("C");
	}
	finally {
		System.out.println("D");
		System.out.println("E");
	}
}
public static void badmethod() {
	throw new RuntimeException();
}
}
