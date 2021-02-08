package collection.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {
	public static void main(String[] args) {
	Marksheet m1=new Marksheet();
	m1.setRollno("1");
	m1.setFname("Pragati");
	m1.setLname("Sugandhi");
	m1.setPhy(42);
	m1.setChe(51);
	m1.setMat(62);
	
	
	Marksheet m2=new Marksheet();
	m2.setRollno("2");
	m2.setFname("Pragati");
	m2.setLname("Dhage");
	m2.setPhy(56);
	m2.setChe(74);
	m2.setMat(90);
	
	
	
	Marksheet m3=new Marksheet();
	m3.setRollno("3");
	m3.setFname("Pragati");
	m3.setLname("Sharma");
	m3.setPhy(60);
	m3.setChe(70);
	m3.setMat(80);
	
	Marksheet m4=new Marksheet();
	m4.setRollno("4");
	m4.setFname("Pragati");
	m4.setLname("Salunke");
	m4.setPhy(75);
	m4.setChe(82);
	m4.setMat(60);
	
	
	
	Marksheet m5=new Marksheet();
	m5.setRollno("5");
	m5.setFname("Pragati");
	m5.setLname("Gupta");
	m5.setPhy(48);
	m5.setChe(52);
	m5.setMat(67);
	
	
	ArrayList l = new ArrayList();
	l.add(m1);
	l.add(m2);
	l.add(m3);
	l.add(m4);
	l.add(m5);
	
	Collections.sort(l,new Orderbyname());
	//Collections.sort(l,new Orderbymaths());
	Iterator it = l.iterator();
	while (it.hasNext()){
		Marksheet m = (Marksheet) it.next();
		System.out.println(m.getRollno() +" "+m.getFname()+" "+m.getLname()+" "+m.getPhy()+" "+m.getChe()+" "+m.getMat());
	}
	
	
	}

}
