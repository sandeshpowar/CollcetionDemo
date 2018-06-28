package collectionDemoPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		Student s=new Student(1, "Abc", 77);
		Student s1=new Student(2, "Abc", 77);
		Student s2=new Student(3, "Abc", 77);
		Student s3=new Student(4, "Abc", 77);
		Student s4=new Student(5, "Abc", 77);
		
		List<Student> l=new LinkedList<Student>();
		//l.add(null);
		l.add(s);
	//	l.remove(s);
		l.add(s1);
		l.add(s3);
		l.add(s2);
		l.add(s4);
		/*Emp e=new Emp(23, "Sandy");
		Emp e1=new Emp(25, "Maddy");
		ArrayList<Object> l1=new ArrayList<>();
		l1.add(e);
		l1.add(e1);*/
		
		
		System.out.println("\n Value of given Index "+l.get(1));	
		System.out.println("\n Value of given Index "+l.indexOf(s3));
		System.out.println("\n Size of given Collection "+l.size());
		System.out.println("\n  Value of given LastIndex "+l.lastIndexOf(s4)+"\n\n");	
		//System.out.println(l);
		
		Iterator<Student> i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
	
	
}
class Student
{
	int studId;
	String studName;
	int studMarks;
	public Student(int studId, String studName, int studMarks) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studMarks = studMarks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudMarks() {
		return studMarks;
	}
	public void setStudMarks(int studMarks) {
		this.studMarks = studMarks;
	}
public String toString()
{
	return studId+"\t"+studName+"\t"+studMarks;
}
	
}
/*class Emp 
{
	int empId;
	String empName;
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String toString()
	{
		return empId+"\t"+empName;
	}
}
*/
/*
Collection:--
			-- If u want to represent group of individual object as a single entity then we 
				should go with Collection(1.2 version Interface);

Legacy Classes:--
			-- Which Comes From old generation (1.0 version) are known as Legacy Classes.
			
List:--
		-- List is a child interface of Collection Which Comes From 1.2 version.
		-- If We Want to represent group of individual object as a single entity where insertion 
			order is preserved also duplicates are also allowed.
			
			-- null insertion is possible.
			-- Duplicates are allowed.
			-- insertion order is preserved.
			
			Some Common Methods are as Follows
			
			add(object o);
			Boolean addAll(int index,Collection c);
			remove(int index);
			get();
			set(int index,object o);
			
			
ArrayList:--
			- Underlying dataStructure for ArrayList is resizable array or growable array.
			- ArrayList is a Child Of List Interface. Which is Comes From 1.2 version.
			- Insertion order is preserved.
			- Duplicates are allowed.
			- null insertion is possible.
			- Heterogeneous objects are allowed(In TreeMap and TreeSet are Not allowed ).
			- ArrayList Implements the RandomAccess interface.
			- It mostly Used for Retrieval.
			- ListIterator iterate the object from arraylist one by one .
			
			ArrayList Constructor:-
			
			1)	ArrayList al=new ArrayList();
					-- This Constructor creates an empty ArrayList with Default size is 10.
					-- If elements reach at the max Location Then Size Of arralist will be growable
							i.e. Current Capacity*3/2+1;
			
			2)	ArrayList al=new ArrayList(int initialCapacity);
					-- This Constructor creates an ArrayList with specified Capacity.
					
			3) ArrayList al=new ArrayList(Collection c);
					-- If want to creates an Equilevalent ArrayList Then We should 
						go with This Constructor.
						
	LinkedList:--
				- Underlying DataStructure for LinkedList is Doubly LinkedList.
				- insertion Order is preserved.
				- Duplicates are allowed.
				- Adding Element at middle is possible.
				- Removing element at list is possible.
				- worst for retriveing operation.
				- null insertion is possible.
				
				Constructors:
						
					LinkedList l=new LinkedList();
						- Creates an empty linkedlist;
					
					LinkedList l=new LinkedList(Collection c);
						- creates an equivalent LinkedList object;
					
				Methods:-
						void addFirst();
						void addLast();
						void removeFirst();
						void removeLast();
						
						
		Vector:-
					- The Underlying data Structure for Vector is Resizable array or growable array.
					- insertion order is preserved.
					- null insertion is possiible.
					- duplicates are allowed.
					- Vector implements clonnable and serizable iterface.
					- it implements RandomAccess Interface.
					- Methods are synchronized thats why vector objects are thread safe.
					
					
					Constructors:--
					Vector v=new Vector();
							- Which comes from 1.0 version called as legacy class
							- Creates an empty vector.With Size default size is 10;
							- when it will reach at the max location then vector size will doubled .
								Current capacity *2;
					Vector v=new Vector(int initialCapacity);
							- Creates an Vector with specified Size.
							
					Vector v=new Vector(int initialCapacity,int incrementalCapacity);
							- creates an Vector with specified capacity 
						
					Vector v=new Vector(Collection c);
							- Creates An Equilavent Vector.
					
					Vector Methods:-
					
						addElement();
						removeElement();
						addElementAt();
						
						
			Stack:-
					- Stack is child of vector which comes From 1.0 version called as Legacy Class.
					- Specially designed for Last in First Out.
				
				
			Constructors:-
					Stack s=new Stack();
					Creates an Empty Stack;
					
			Methods:
			
			push() add the element;
			pop() remove the element;
			peek() get the top of stack without removing object;
			isEmpty() it will check the stack is empty or not;
			
			
			
			
					
				






*/