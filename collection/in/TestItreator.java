package collection.in;

import java.util.ArrayList;
import java.util.Iterator;

public class TestItreator {
	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		a.add("Roshni");
		a.add("Madhuri");
		a.add("Lalit");
		Iterator it =a.iterator();
		while(it.hasNext()){
		Object o = it.next();
		System.out.println(o);
		}
		
		
		
	}
	

}
