package day2����;

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
/*��java API Collections������:�������ϵĹ�����,�������и����йؼ��ϲ����ľ�̬��̬����;
Collections.min(list);//��ȡ��Сֵ
Collections.max(list);//��ȡ���ֵ*/
}
}
