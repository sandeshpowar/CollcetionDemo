package collectionDemoPractice;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Object> t=new TreeSet<>(new MyComparator());
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(422);
		t.add(44578);
		t.add(402222222);
		
		t.add(5078855);
		t.add(60);
		System.out.println(t);
	}

}
class MyComparator implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		
			Integer i1=(Integer)obj1;
			Integer i2=(Integer)obj2;
		
			return 1;
			
		//	return i2.compareTo(i1);
			
	}
	
}
