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
		// TODO 自动生成的方法存根
System.out.println(ee("easkjedaeihws"));
	}

}
