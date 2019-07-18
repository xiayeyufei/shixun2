package day2课堂;

import java.util.HashSet;
import java.util.Iterator;

import javax.print.attribute.standard.MediaName;

public class iteraterpp {
	public static void main(String[] args) {
		HashSet<Integer> set =new HashSet<Integer>();
		for(int i=1;i<6;i++) {
			set.add(new Integer(i));
		}
		
		Iterator<Integer> it=set.iterator();//获得游标
		while(it.hasNext()) {
			Integer jInteger=(Integer)it.next();
			System.out.println(jInteger);
			
			
;
			}
		it.remove();/*删除游标左边的元素，
		在执行完next之后，该操作只能执行一次
		从底层集合中删除此迭代器返回的最后一个
		元素（可选操作）。 此方法只能调用一次next() 。
		 如果底层集合在迭代过程中以任何方式
		 进行修改而不是通过调用此方法，
		 则迭代器的行为是未指定的。 
*/
		System.out.println(set);
	}
}
