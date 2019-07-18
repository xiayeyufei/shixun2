package day8;

public class Reflection {
	public static void main(String[] args) {
		String classname="day8.Hero";
		try {
			Class pclass=Class.forName(classname);
			Class pclass2=Hero.class;
			Class pclass3=new Hero().getClass();
			System.out.println(pclass);
			System.out.println(pclass==pclass2);
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
