package collection.in;

import java.util.ArrayList;

public class TestAllelement {
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("five");
		v.add("six");
		v.add("seven");
		int size = v.size();
		for(int j=0; j<size; j++){
			Object o = v.get(j);
			System.out.println(j+":" +o.toString());
			//System.out.println(j+ ":" +o);// below comment is same as above to print a result
		//System.out.println(j+ ":" +v.get(j));
			
			
		}
		
	}

}
