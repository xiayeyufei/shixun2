package javashixun;

public class practice3 {
public static void main(String[] args) {
	int a[]=new int[10];
	for (int i=0;i<a.length;i++) {
		a[i]=(int)(Math.random()*100);
	}
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=0;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int x:a) {
		System.out.println(x);
	}
}
}
