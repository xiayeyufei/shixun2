package day6;

public class TestThread1 {
	public static void main(String[] args) {
		int i=0;
		for(i=0;i<100;i++) {
			System.out.println(Thread1.currentThread().getName()+i);//currentThread()���ضԵ�ǰ����ִ�е��̶߳�������á� 
			//getName()���ش��̵߳����ơ�
			//��Ҫ��ȡmain�������ڵ��̶߳�������ƣ�����ô����?
			//�����������,Thread���ṩ��һ���ܺ���ķ���:
			//public static Thread currentThread():���ص�ǰ����ִ�е��̶߳���
			if (i==30) {
				Thread t1=new Thread1();
				Thread t2=new Thread1();
				t1.start();
				t2.start();
				
			}
		}
		
		}
	}

