package day6.join;

public class TestJoin {
	public static void main(String[] args) {
		JoinThread thread=new JoinThread();
		thread.start();
		try {
			thread.join();//等待这个线程死亡。 即等待该线程死亡再恢复其它线程
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		for(int i=0;i<20;i++) {
			System.out.println("-----Mian-----"+i);
		}
	}
}
