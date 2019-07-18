package day6.lock;



public class syndfgear implements  Runnable {
	Timer timer=new Timer();


	public static void main(String[] args) {
		syndfgear testSyndfgear=new syndfgear();
		Thread t1=new Thread(testSyndfgear);
		Thread t2=new Thread(testSyndfgear);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
	public void run() {
		timer.add(Thread.currentThread().getName());
	}
} 
