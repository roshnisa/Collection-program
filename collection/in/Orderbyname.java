package collection.in;

import java.util.Comparator;

public class Orderbyname implements Comparator<Marksheet> {

	public int compare (Marksheet m1,Marksheet m2){
		//return m1.getFname().compareTo(m2.getFname());
		//return m2.getMat()-m1.getMat();
		//return m2.getPhy()-m1.getPhy();
		//return m2.getChe()-m1.getChe();
		//return- (m1.getLname().compareTo(m2.getLname()));  
		///if we use (-) sign....the result wil print revers order 
		/*if(m1.getFname().equals(m2.getFname())){
			return m1.getLname().compareTo(m2.getLname());
		}
		else
			//return m1.getFname().compareTo(m2.getFname());*/
		//return -((m1.getFname().equals(m2))?  m1.getFname().compareTo(m2.getFname()): m1.getLname().compareTo(m2.getLname()));
		if (m1.getFname().equals(m2.getFname())){
			return m1.getLname().compareTo(m2.getLname());
		}
			else 
			
				return m1.getFname().compareTo(m2.getFname());
		}
	}
	
	

 