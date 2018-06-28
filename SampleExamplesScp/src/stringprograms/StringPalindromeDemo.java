package stringprograms;

import java.util.Scanner;

public class StringPalindromeDemo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=in.nextLine();
		if(str!=null)
		{
		int length=str.length();
		System.out.println("Given length of String =\t"+length);
		}
		else 
		{
			System.out.println("Enter only valid String");
		}
		
	}

}
