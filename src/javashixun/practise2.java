package javashixun;

public class practise2 {
	 static int ee(String es) {
		 boolean flag=true;
		 int j=0;
		 int i=0;
	while(flag) {
		
		int a=-1;
		a=es.indexOf('e', i);
		if (a!=-1) {
			i=a;
			i++;
			j=j+1;
		}
		
		else  {
			flag=false;
		}
	}
		 return j;
	 }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
System.out.println(ee("easkjedaeihws"));
	}

}
