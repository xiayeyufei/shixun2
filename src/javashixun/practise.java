package javashixun;

public class practise {
	static int qiuhe(String str1,String str2) {
		Integer a=new Integer(str1);
		Integer b=new Integer(str2);
		int i=a.intValue()+b.intValue();
		return i;
	}

	public static void main(String[] args) {
		System.out.println(qiuhe("123","32"));

	}

}
