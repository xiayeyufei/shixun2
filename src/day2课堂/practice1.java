package day2����;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class practice1 {
public static void main(String[] args) {
	List<Integer> lalala=new ArrayList<>();
	for (int i=0;i<9;i++) {
		lalala.add(i);
	}
	ListIterator<Integer> ii=lalala.listIterator();
	while(ii.hasNext()) {
		int i=ii.next();
		System.out.println(i);
	}
	ii.previous();//���б���ɾ���� next()�� previous()���ص����һ��Ԫ�أ���ѡ�������� 
	ii.set(45);//�α���ָ�滻
	System.out.println(ii.previous());
	System.out.println(ii.next());
	System.out.println(ii.next());
	System.out.println(ii.nextIndex());//���������� next()���ص�Ԫ�ص������� 
	HashSet<Integer> set =new HashSet<>();
	set.add(1);
	set.add(1);
	set.add(2);
	set.add(2);
	set.add(3);
	set.add(3);
	set.add(4);
	System.out.println(set);
}
}
