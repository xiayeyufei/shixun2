package day2øŒÃ√;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class mappractice {
public static void main(String[] args) {
	//º”‘ÿ“Ú◊”
	Map m1=new HashMap<>();
	Map m2=new TreeMap<>();
	Map m3=new HashMap<>();
	m1.put("one", new Integer(1));
	m1.put("two", new Integer(2));
	m1.put("three", new Integer(3));
	System.out.println(m1.get("one"));//1
	System.out.println(m1.size());//3
	System.out.println(m1.isEmpty());//false
	System.out.println(m1.values());//[1, 2, 3]
	System.out.println(m1.keySet());//[one, two, three]
	System.out.println(m1.containsValue(3));//true
	System.out.println(m1.containsKey("one"));//true
	m3.putAll(m1);
	System.out.println(m1);//{one=1, two=2, three=3}
	System.out.println(m3);//{two=2, three=3, one=1}
	Iterator aa=m1.keySet().iterator();
	Iterator bb=m1.entrySet().iterator();
	while(bb.hasNext()) {
		System.out.println(bb.next());
	}
	/*one=1
two=2
three=3*/
	/*while(aa.hasNext()) {
		System.out.println(aa.next());
	}*/
	/*one
	two
	three*/
	while(aa.hasNext()) {
		
		System.out.println( m1.get((String) (aa.next())));
/*1
2
3*/
	}
}
}
