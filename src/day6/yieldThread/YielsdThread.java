package day6.yieldThread;

public class YielsdThread extends Thread{
	YielsdThread(String s){
		super(s);
	}
	public void run() {
		for (int i=0;i<20;i++) {
			System.out.println(getName()+":"+i);
			if((i%10)==0) {
				Thread.yield();//������Ϊ���ó�cpu����ǰ�߳̽���������еȴ�����
			}
		}
	}
}
