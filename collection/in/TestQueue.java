package collection.in;

import java.util.PriorityQueue;
//
public class TestQueue {
	public static void main(String[] args) {
		PriorityQueue p =new PriorityQueue();
		/*p.add("roshni");
		p.add("pragati");
		p.add("madhuri");
		p.add("Lalit");
		p.add("amar");*/
		p.add(1);
		p.add(2);
		p.add(3);
		p.add(4);
		p.add(5);
		System.out.println(p.poll());
	}

}
