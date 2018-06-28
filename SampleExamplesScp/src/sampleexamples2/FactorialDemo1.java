package sampleexamples2;

import java.util.Scanner;

public class FactorialDemo1 {

	public static void main(String[] args) {
		
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter one Number");
		int num=in.nextInt();
		
		if(num!=0)
		{
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
		}

	}

}
