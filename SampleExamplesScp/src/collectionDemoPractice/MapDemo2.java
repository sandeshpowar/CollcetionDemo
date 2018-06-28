package collectionDemoPractice;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class MapDemo2 {
public static void main(String[] args) {
	HashMap<Integer,String> h=new HashMap<Integer, String>();
	h.put(23, "Sandesh");
	h.put(24, "Suj");
	h.put(25, "Sandy");
	h.put(26, "Suja");
	System.out.println(h);
	System.out.println(h.keySet());
	System.out.println(h.values());
	System.out.println(h.entrySet());
	
	
	
}
}
