package sampleexamples;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String");
		String str1=sc.nextLine();
		
		int len=str1.length();
		System.out.println(len );
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(str1.charAt(i));
		}
		
		
	} 

}
