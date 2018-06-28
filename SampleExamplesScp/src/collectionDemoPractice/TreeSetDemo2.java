package collectionDemoPractice;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
public static void main(String[] args) {
	TreeSet<Object> t=new TreeSet(new MyClass());
	t.add("Sandy");
	t.add("Maddy");
	t.add("Suj");
	System.out.println(t);
}
}
class MyClass implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
		
	}
	
}