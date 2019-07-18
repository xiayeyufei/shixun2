package day6.Deadlock;

public class DeadlockTest {
public static void main(String[] args) {
	Object obj1=new Object();
	Object obj2 =new Object();
	DeadlockThread1 thread1=new DeadlockThread1(obj1, obj2);
	DeadlockThread2 thread2=new DeadlockThread2(obj1, obj2);
	thread1.start();
	thread2.start();
}
}
