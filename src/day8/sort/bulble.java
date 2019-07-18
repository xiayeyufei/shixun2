package day8.sort;

public class bulble {
public static void main(String[] args) {
//	int num[]= {84,83,88,87,61};
//	for (int i = 0; i < num.length; i++) {
//		for (int j = 0; j < num.length-i-1; j++) {
//			if(num[j]>num[j+1]) {
//				int temp=num[j];
//				num[j]=num[j+1];
//				num[j+1]=temp;
//			}
//			
//		}
//		
//	}
//	for (int i = 0; i < num.length; i++) {
//		System.out.println(num[i]);
//		
//	}
//}
	int num[]= {84,83,88,87,61,6,8,63,1,6,16,6,16,16,8,81};
	for (int i = 0; i < num.length; i++) {
		for (int j = i; j < num.length; j++) {
			int temp=num[i];
			if (temp>num[j]) {
				num[i]=num[j];
				num[j]=temp;
				for (int d = 0; d< num.length; d++) {
					System.out.print(num[d]+" ");
			}
				System.out.println("");
			
		}
		
	}
	
		
	}
}
}
