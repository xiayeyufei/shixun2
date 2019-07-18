package day6.Deadlock;

public class DeadlockThread1 extends Thread{
	private Object obj1;
	private Object obj2;
	public DeadlockThread1(Object obj1,Object obj2) {
		super ();
		this .obj1=obj1;
		this.obj2=obj2;
		
	}
	public void run(){
		synchronized (obj1) {
		System.out.println("�߳�1�Ѿ�����obj1�Ķ������ڵȴ�obj2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		synchronized (obj2) {
			System.out.println("�߳�1�Ѿ�����obj2�����������");
		}
		}
	}

}
