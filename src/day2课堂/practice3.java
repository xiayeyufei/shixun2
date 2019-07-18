package day2¿ÎÌÃ;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class practice3 {
public static void main(String[] args) {
	List ii=new ArrayList<>();
	for(int i=1;i<6;i++) {
		ii.add(i);
	}
	ListIterator ss=ii.listIterator();
	while(ss.hasNext()) {
		System.out.println(ss.next());
	}
}
}
