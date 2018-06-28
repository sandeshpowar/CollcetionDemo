package collectionDemoPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class NAvigationDemo {
	public static void main(String[] args) {
		ArrayList<String> t=new ArrayList<String>();
		t.add("A");
		t.add("Z");
		t.add("B");
		t.add("C");
		t.add("D");
		t.add("E");
		t.add("F");
		System.out.println(t);
		Collections.sort(t);
		System.out.println("After Sorting ArrayList"+t);
		Collections.sort(t,new MyComparator1());
		System.out.println("Reverse Order-----"+t);
	}

}
class MyComparator1 implements Comparator<Object>
{
	public int compare(Object ob1,Object ob2)
	{
		String s1=ob1.toString();
		String s2=ob2.toString();
		return s2.compareTo(s1);
	}
}
