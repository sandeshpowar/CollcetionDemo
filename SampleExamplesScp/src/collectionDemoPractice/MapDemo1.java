package collectionDemoPractice;

import java.util.HashMap;

public class MapDemo1 {
public static void main(String[] args) {
	HashMap<String, String> h=new HashMap<>();
	h.put("A", "ABC");
	h.put("B", "BBC");
	h.put("C", "CBC");
	h.put("D", "DBC");
	h.put("D", "EBC");
	System.out.println(h);
	HashMap<String, String> h1=new HashMap<>();
	h1.put("Z", "AB");
	h1.put("B", "BB");
	h1.put("C", "CB");
	h1.put("D", "DB");
	
	System.out.println("get value for D----\t"+h.get("D"));
	System.out.println("Adding the entry------\t\t"+h1.put("Sandesh","Suj"));	
	System.out.println("Adding the same entry-----\t"+h1.put("Sandesh","Suj"));	
	h1.putAll(h);
	System.out.println("PutAll -----\t\t\t"+h1);	
	System.out.println("Removes the Entry-----\t\t"+h1.remove("A"));	
	System.out.println("After All Operation Result------>"+h1);	
	System.out.println("Check the key is available or not -----\t\t"+h1.containsKey("Z"));
	System.out.println("Check the Value is available or not -----\t\t"+h1.containsValue("AB"));
	System.out.println("Check the entry's  available or not -----\t\t"+h1.isEmpty());
	System.out.println("Check the Size of map -----\t\t"+h1.size());
	h1.clear();
	System.out.println("Check the Size of map -----\t\t"+h1);
}
}
