package day2¿ÎÌÃ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

import org.omg.CosNaming.IstringHelper;

public class practice5 {
	public static void main(String[] args) {
		ArrayList<String> lll=new ArrayList<>() ;
		Scanner sc=new Scanner(System.in);
		String flag="";
		String str1=sc.next();
		str1.toLowerCase();
		HashMap<String,String> liii=new HashMap<>();
		while(true) {
			
			lll.add(str1);
			flag=str1;
			liii.put(str1.toLowerCase(),str1);
			if (flag.equals("-1")) {
				break;
			} else {
				str1=sc.next();
			}
			
	}
	ArrayList nan=(ArrayList)liii.keySet();
	Collections.sort(nan);
	for (int i=0;i<nan.size();i++) {
		System.out.println(liii.get(nan.get(i)));
	}
	
	
	
	
}
}
