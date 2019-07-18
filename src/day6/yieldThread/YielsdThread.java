package day6.yieldThread;

public class YielsdThread extends Thread{
	YielsdThread(String s){
		super(s);
	}
	public void run() {
		for (int i=0;i<20;i++) {
			System.out.println(getName()+":"+i);
			if((i%10)==0) {
				Thread.yield();//礼让行为，让出cpu，当前线程进入继续队列等待调度
			}
		}
	}
}
