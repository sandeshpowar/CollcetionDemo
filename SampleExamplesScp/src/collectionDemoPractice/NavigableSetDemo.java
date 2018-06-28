package collectionDemoPractice;

import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> i=new TreeSet<Integer>();
		i.add(1000);
		i.add(2000);
		i.add(3000);
		i.add(4000);
		i.add(5000);
		i.add(6000);
		i.add(7000);
		System.out.println(i);
		
		//System.out.println(i.floor(8000));    //it will returns either or before <=
	//	System.out.println(i.lower(3000));	// it will returns exact before<
		System.out.println(i.ceiling(3000));    // it will returns either or after >=
	System.out.println(i.higher(3000));  /* */ // it will returns strictly after >
		/*System.out.println("PollFirst-----"+i.pollFirst());
		System.out.println("After pollFirst----"+i);
		System.out.println("pollLast-------"+i.pollLast());
		System.out.println("After pollLast----"+i);
		System.out.println("Reverse order ----"+i.descendingSet());*/
	}

}
