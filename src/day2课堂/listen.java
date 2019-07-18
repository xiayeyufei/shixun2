package day2课堂;

import java.util.HashSet;
import java.util.Set;

public class listen {
public static void main(String[] args) {
	Set s1=new HashSet<>();
	Set s2=new HashSet<>();
	s1.add("a");
	s1.add("b");
	s1.add("c");//s1=[a,b,c]
	s2.add("d");
	s2.add("a");
	s2.add("b");//s2=[d,a,b]
	Set sn = new HashSet<>(s1);//sn=[a,b,c]
	System.out.println(s1);//[a, b, c]
	System.out.println(sn.retainAll(s2));//仅保留此 collection 中那些也包含在指定 collection 的元素,只剩下[a,b]
	System.out.println(sn);//[a,b]
	Set su=new HashSet<>(s1);
	su.addAll(s2);
	System.out.println(sn);//[a,b]
	System.out.println(su);//[a, b, c, d]
}
}
