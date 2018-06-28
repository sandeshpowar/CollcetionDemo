package collectionDemoPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public class Collection1 {
	public static void main(String[] args) {
		
		Employee e=new Employee(1, "Abc", 3000.1f);
		Employee e1=new Employee(2,"Xyz", 4000.1f);
		Employee e2=new Employee(3, "SSP", 5000.1f);
		
		Employee e3=new Employee(4, "msp", 6000.1f);
		Employee e4=new Employee(5, "Pqr", 7000.1f);
		Employee e5=new Employee(5, "Pqr", 7000.1f);
		List<Employee> l=new LinkedList<>();
		l.add(e);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
	
	
		
		//System.out.println("Output===="+l);
		
		Iterator<Employee> i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
class Employee
{
	int empId;
	String empName;
	float empSalary;
	public Employee(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return empId+"\t"+empName+"\t"+empSalary;
		
	}
	
	
	
	
}
