package day6.homework3;

public class xiancheng implements Runnable {
int i=0;
public xiancheng(int i) {
	super();
	// TODO �Զ����ɵĹ��캯�����
	this.i=i;
}
public void run() {
	for (int j = 0; j < 200; j++) {
		System.out.println("�߳�"+i+"��������");
		
	}
	
	
}
}
