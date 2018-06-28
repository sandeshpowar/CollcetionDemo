package collectionDemoPractice;

import java.util.TreeMap;

public class NAvigableMapDemo {
public static void main(String[] args) {
	TreeMap<String, String> t=new TreeMap<>();
	t.put("A", "Abc");
	t.put("B", "Bac");
	t.put("C", "Cbc");
	t.put("D", "Dbc");
	System.out.println(t);
	System.out.println(t.floorKey("B"));   // it will returns the either element or before 
	System.out.println(t.lowerKey("B")); 		// it will returns the strictly before element
	System.out.println(t.ceilingKey("B")); 		// it will returns the either or after 
	System.out.println(t.higherKey("B")); 		//it will returns the strictly after
	System.out.println(t.pollFirstEntry());    // it will removes and retuns the first key
	System.out.println(t.pollLastEntry()); 				// last
	System.out.println(t.descendingKeySet()); //reverse order
}
}
