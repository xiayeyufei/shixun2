package day6.join;

public class TestJoin {
	public static void main(String[] args) {
		JoinThread thread=new JoinThread();
		thread.start();
		try {
			thread.join();//�ȴ�����߳������� ���ȴ����߳������ٻָ������߳�
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		for(int i=0;i<20;i++) {
			System.out.println("-----Mian-----"+i);
		}
	}
}
