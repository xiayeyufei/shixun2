package day2¿ÎÌÃ;

import java.util.ArrayList;
import java.util.List;

public class list {
public static void main(String[] args) {
	List l1=new ArrayList();
	l1.add("aaa");
	l1.add("bbbb");
	l1.add(new Integer(11));
	l1.get(0);
	System.out.println(l1);
	System.out.println(l1.get(0));
	for(int i=0;i<l1.size();i++) {
		System.out.println(l1.get(i));
	}
	}
}
