package day2课堂;

import java.util.LinkedList;
import java.util.List;

public class list3 {
	List a;
	public list3() {
		// TODO 自动生成的构造函数存根
		a=new LinkedList();
		
		}
	public void put(Object o) {
		a.add(o);
		}
	public Object get() {
		Object o=a.get(0);
		a.remove(0);
		return o;
	}
	public boolean isEmpty() {
		if(a.isEmpty()) {
			return true;
			
		}
		return false;
	}
}
