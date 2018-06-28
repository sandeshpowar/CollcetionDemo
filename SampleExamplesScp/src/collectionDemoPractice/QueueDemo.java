package collectionDemoPractice;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
public static void main(String[] args) {
	PriorityQueue<Object> p=new PriorityQueue();
	p.add("Sandy");
	p.add("Maddy");
	p.add("Suj");
	p.add("One");
	p.add("Two");
	p.add("Three");
	System.out.println(p);
	System.out.println("offer ----adding into queue\t"+p.offer("Four")); // adding the object into the queue
	System.out.println("After Offer-----------------\n"+p);
	
	System.out.println("Peek----Returns head of the queue---null\t\t"+p.peek());	// it returns  head element of queue if queue is empty then it will return null
	System.out.println("After peek-----------------\n"+p);
	
	System.out.println("Element ----- Returns Head of the Element-- exception"+p.element());//  it returns  head element of queue if queue is empty then raises the exception NoSuchElementException
	System.out.println("After Element-----------------\t\t\t"+p);
	
	System.out.println("Removes head of the element----null"+p.poll());//  to remove and return head element of queue  if queue is empty then it will return null
	System.out.println("Removes head of the element----null"+p.poll());
	System.out.println("Removes head of the element----null"+p.poll());
	System.out.println("Removes head of the element----null"+p.poll());
	System.out.println("Removes head of the element----null"+p.poll());
	System.out.println("Removes head of the element----null"+p.poll());
	System.out.println("Removes head of the element----null"+p.poll());
	System.out.println("After Poll-----------------"+p);
	
	System.out.println("Removes head of the element----Exception"+p.remove()); //to remove and returns  head element of queue if queue is empty then raises the exception NoSuchElementException
	
	System.out.println(p);
}
}

