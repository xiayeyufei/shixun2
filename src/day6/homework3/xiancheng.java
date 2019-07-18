package day6.homework3;

public class xiancheng implements Runnable {
int i=0;
public xiancheng(int i) {
	super();
	// TODO 自动生成的构造函数存根
	this.i=i;
}
public void run() {
	for (int j = 0; j < 200; j++) {
		System.out.println("线程"+i+"正在运行");
		
	}
	
	
}
}
