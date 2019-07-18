package day6;

public class TestThread1 {
	public static void main(String[] args) {
		int i=0;
		for(i=0;i<100;i++) {
			System.out.println(Thread1.currentThread().getName()+i);//currentThread()返回对当前正在执行的线程对象的引用。 
			//getName()返回此线程的名称。
			//我要获取main方法所在的线程对象的名称，该怎么办呢?
			//遇到这种情况,Thread类提供了一个很好玩的方法:
			//public static Thread currentThread():返回当前正在执行的线程对象
			if (i==30) {
				Thread t1=new Thread1();
				Thread t2=new Thread1();
				t1.start();
				t2.start();
				
			}
		}
		
		}
	}

