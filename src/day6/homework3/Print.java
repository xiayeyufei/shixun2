package day6.homework3;

public class Print {
	public static void main(String[] args) {
		xiancheng x1=new xiancheng(1);
		xiancheng x2=new xiancheng(2);
		Thread t1=new Thread(x1);
		Thread t2=new Thread(x2);
		t1.setPriority(10);
		t2.setPriority(6);
		t1.start();
		t2.start();
		
	}
}
