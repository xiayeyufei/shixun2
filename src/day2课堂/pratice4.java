package day2课堂;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class pratice4 {
public static void main(String[] args) {
	List<String> ii=new ArrayList<>();
	ii.add("apple");
	ii.add("banana");
	ii.add("grape");
	ii.add("pear");
	System.out.println(Collections.max(ii));
	System.out.println(Collections.min(ii));
/*用java API Collections工具类:操作集合的工具类,它包含有各种有关集合操作的静态多态方法;
Collections.min(list);//获取最小值
Collections.max(list);//获取最大值*/
}
}
