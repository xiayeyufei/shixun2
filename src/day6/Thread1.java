package day6;

public class Thread1 extends Thread  {
	public void run() {
		for (int i = 0; i <100; i++) {
			System.out.println(Thread.currentThread().getName()+i);
			
		}
	}
}
