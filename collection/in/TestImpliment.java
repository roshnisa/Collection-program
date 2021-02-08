package collection.in;

import java.util.ArrayList;


public class TestImpliment {
	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		a.add("one");
		a.add("two");
		a.add("three");
		a.add("four");
		a.add("five");
		a.add("six");
		Integer i = new Integer(9);
		a.add(i); 
		Integer value =(Integer)a.get(6);
		System.out.println(value);
		System.out.println(a);
		
		
		
		
	}
	

	
	

}
