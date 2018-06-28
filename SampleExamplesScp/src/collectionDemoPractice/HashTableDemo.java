package collectionDemoPractice;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable h=new Hashtable<>(73);
		h.put(new Sample(20), "A");
		h.put(new Sample(10), "B");
		h.put(new Sample(19), "C");
		h.put(new Sample(17), "D");
		h.put(new Sample(73), "E");
		h.put(new Sample(43), "F");
		System.out.println(h);
	}
}
class Sample
{
	int i;
	Sample(int i)
	{
		this.i=i;
	
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i+"";
	}
}

	