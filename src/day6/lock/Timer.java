package day6.lock;

public class Timer {
	private static int num=0;
	public  void add(String name) {
		synchronized (this) {
			num++;
			try {
				Thread.sleep(1000);
				System.out.println(name+"you are the"+num+"program to use timer program");
			} catch (InterruptedException e) {
				// TODO: handle exception
				
			}
		}
	}
}
