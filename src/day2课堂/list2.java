package day2¿ÎÌÃ;

import java.util.LinkedList;
import java.util.List;

public class list2 {
public static void main(String[] args) {
	List li=new LinkedList();
	for(int i=0;i<=5;i++) {
		li.add(i);
	}
	System.out.println(li);
	li.add(3,"a100");
	System.out.println(li);
	li.set(4, "b100");
	System.out.println(li);
	System.out.println(li.get(3));
	System.out.println(li.indexOf("a100"));
	li.remove(0);
	System.out.println(li);
}
}
