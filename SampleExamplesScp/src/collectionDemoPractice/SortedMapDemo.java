package collectionDemoPractice;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
public static void main(String[] args) {
	SortedMap<Object, Object> s=new TreeMap<Object, Object>();
	s.put(2, 2);
	s.put(3, 2);
	s.put(4, 2);
	s.put(5, 2);
	System.out.println(s);
	System.out.println(s.firstKey());
	System.out.println(s.lastKey());
	System.out.println(s.headMap(4));
	System.out.println(s.tailMap(4));
	System.out.println(s.subMap(3,5));
	
}
}
