package collectionDemoPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemoPra {
public static void main(String[] args) {
	ArrayList<Object> al=new ArrayList<Object>();
	al.add(80);
	al.add(10);
	//al.add("ABCD");
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	al.add(60);
	System.out.println(al);
	System.out.println("Before Sorting arrayList-----"+al);
	
	System.out.println("Ascending Order-----"+al);
	//Collections.sort(al,new MyClass23());
	System.out.println("Afetr Sorting arrayList-----"+al);
}
}
class MyClass23 implements Comparator<Object>
{
	public int compare(Object ob2,Object ob3)
	{
		Integer i1=(Integer)ob2;
		Integer i2=(Integer)ob3;
		return i2.compareTo(i1);
		
		
	}
}