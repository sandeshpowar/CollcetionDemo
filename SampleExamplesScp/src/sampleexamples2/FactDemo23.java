package sampleexamples2;

import java.util.Scanner;

public class FactDemo23 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=in.nextInt();
		
		if(num!=0)
		{
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of given number is\t"+fact);
		}else {
			System.out.println("Please enter a valid number");
		}

	}

}
