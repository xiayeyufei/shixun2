package day2����;

import java.util.HashSet;
import java.util.Iterator;

import javax.print.attribute.standard.MediaName;

public class iteraterpp {
	public static void main(String[] args) {
		HashSet<Integer> set =new HashSet<Integer>();
		for(int i=1;i<6;i++) {
			set.add(new Integer(i));
		}
		
		Iterator<Integer> it=set.iterator();//����α�
		while(it.hasNext()) {
			Integer jInteger=(Integer)it.next();
			System.out.println(jInteger);
			
			
;
			}
		it.remove();/*ɾ���α���ߵ�Ԫ�أ�
		��ִ����next֮�󣬸ò���ֻ��ִ��һ��
		�ӵײ㼯����ɾ���˵��������ص����һ��
		Ԫ�أ���ѡ�������� �˷���ֻ�ܵ���һ��next() ��
		 ����ײ㼯���ڵ������������κη�ʽ
		 �����޸Ķ�����ͨ�����ô˷�����
		 �����������Ϊ��δָ���ġ� 
*/
		System.out.println(set);
	}
}
