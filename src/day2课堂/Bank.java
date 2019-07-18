package day2¿ÎÌÃ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class listlal{
	String name;
	double money;
	public listlal(String name,int money) {
		this.money=money;
		this.name=name;
		
	}
	public double getMoney() {
		return money;
	}
}
public class Bank {
public static void main(String[] args) {
	ArrayList<Object> list1=new ArrayList<>();
	HashMap<String ,listlal> m1=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	boolean flag=true;
	
	while(flag) {
		int key;
		System.out.println("key£¬0ÍË³ö");
		key=sc.nextInt();
		
		switch (key) {
		case 1:
			System.out.println("ÐÕÃû£¬Ç®£¬ID");
			String na=sc.next();
			int mon=sc.nextInt();
			String ID=sc.next();
			listlal aObject=new listlal(na,mon);
			m1.put(ID,aObject);
			break;
			

		case 0:
			flag=false;
			break;
		}
		
	}
	
    String  ii=sc.next();
    System.out.println(m1.get(ii).getMoney());
   
}
}
