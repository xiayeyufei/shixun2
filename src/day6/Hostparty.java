package day6;

public class Hostparty {
	public static void main(String[] args) {
		test m=new test();
		test m1=new test();
		Thread t1=new Thread(m);
		Thread t2=new Thread(m1);
		t1.start();
		t2.start();
		for(int i=0;i<30;i++) {
			System.out.println("¿ÍÈË"+i+"Çë½ø");
		}
	}
}
