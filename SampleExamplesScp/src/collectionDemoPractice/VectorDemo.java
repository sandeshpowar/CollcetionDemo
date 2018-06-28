package collectionDemoPractice;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	
	StudentDemo sd1=new StudentDemo(1, "ABC", 77);
	StudentDemo sd2=new StudentDemo(2, "XYZ", 78);
	StudentDemo sd3=new StudentDemo(3, "PQR", 79);
	StudentDemo sd4=new StudentDemo(4, "SDF", 80);
	StudentDemo sd5=new StudentDemo(5, "LKJ", 81);
	
	
	
	Vector<StudentDemo> v=new Vector<StudentDemo>();
	
	v.addElement(sd1);
	v.addElement(sd3);
	v.addElement(sd2);
	v.addElement(sd2);
	v.addElement(sd4);
	v.addElement(sd5);
	
	Enumeration<StudentDemo> e=v.elements();
			while(e.hasMoreElements())
			{
				System.out.println(e.nextElement());
			}
			
	System.out.println("value of given index  "+v.indexOf(sd2));

	
}
	
	
}
class StudentDemo
{
	int studId;
	String studName;
	int sstudMarks;
	public StudentDemo(int studId, String studName, int sstudMarks) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.sstudMarks = sstudMarks;
	}
	public StudentDemo() {
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
	public int getSstudMarks() {
		return sstudMarks;
	}
	public void setSstudMarks(int sstudMarks) {
		this.sstudMarks = sstudMarks;
	}
	public String toString()
	{
		return studId+"\t"+studName+"\t"+sstudMarks;
	}
}
