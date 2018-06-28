package collectionDemoPractice;

import java.util.Enumeration;
import java.util.List;


public class Stack {
public static void main(String[] args) {
	StackDemo sd=new  StackDemo(11, "ABC");
	StackDemo sd1=new  StackDemo(12, "PQR");
	StackDemo sd2=new  StackDemo(13, "XYZ");
	
	java.util.Stack<StackDemo> st=new java.util.Stack<StackDemo>();
	st.push(sd);
	st.push(sd1);
	st.push(sd2);
	Enumeration<StackDemo> e=st.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	System.out.println(st.peek());
	System.out.println("pop----"+st.pop());
	System.out.println(st);
}
}
class StackDemo
{
	int stackId;
	String stackName;
	public StackDemo(int stackId, String stackName) {
		super();
		this.stackId = stackId;
		this.stackName = stackName;
	}
	public StackDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStackId() {
		return stackId;
	}
	public void setStackId(int stackId) {
		this.stackId = stackId;
	}
	public String getStackName() {
		return stackName;
	}
	public void setStackName(String stackName) {
		this.stackName = stackName;
	}
	public String toString() {
		return stackId+"\t"+stackName;
	}
}
