import java.util.InputMismatchException;
import java.util.Scanner;

public class morecatch {
public static void main(String[] args) {
	int number[]= {3,4,5,6};
	try {
		for(int i=0;i<number.length;i++) {
			int input=new Scanner(System.in).nextInt();
			System.out.println(number[i]/input);
			
		}
		
}
	catch (InputMismatchException|ArithmeticException e) {
		System.out.println("shuruwrong");
		
	}
	catch (Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

}
}