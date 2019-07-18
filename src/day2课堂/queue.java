package day2¿ÎÌÃ;

import java.util.LinkedList;

public class queue extends LinkedList {
	public void put(Object o) {
		this.addLast(o);
	}
	public Object get() {
		Object o=this.getFirst();
		this.removeFirst();
		return o;
	}
public static void main(String[] args) {
	queue q=new queue();
	q.put("one");
	q.put("two");
	q.put("three");
	q.put("four");
	System.out.println(q);
	System.out.println(q.get());
	System.out.println(q);
	System.out.println(q.get());
	System.out.println(q.contains("one"));
}

}
