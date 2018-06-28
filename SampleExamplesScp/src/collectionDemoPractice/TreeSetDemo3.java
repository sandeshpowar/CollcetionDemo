package collectionDemoPractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo3 {
public static void main(String[] args) {
	TreeSet<Object> t=new TreeSet(new MyClass1());
	t.add(2322);
	t.add(33222);
	t.add(13);
	t.add(15);
	t.add(753);
	t.add(93);
	t.add("xyz");
	t.add("A");
	
	
	System.out.println(t);
}
}
class MyClass1 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String i1=o1.toString();
		String i2=o2.toString();
		
		Integer i3=i1.length();
		Integer i4=i2.length();
		
		if(i3<i4)
			return -1;
		else if (i3>i4) {
			return +1;
			
		}else
			return i3.compareTo(i4);
		
	}
}
