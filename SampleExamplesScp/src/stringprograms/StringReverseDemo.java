package stringprograms;

import java.util.Scanner;

public class StringReverseDemo {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enetr a String");
		String str=in.nextLine();
		
		if(str!=null)
		{
		StringBuffer strb=new StringBuffer(str);
		strb.reverse();
		System.out.println("Before Reverse String==\t"+str);
		System.out.println("After Reverse String==\t"+strb);
		}else{
			System.out.print("Enetr a Valid String");
		}
	
	}

}
