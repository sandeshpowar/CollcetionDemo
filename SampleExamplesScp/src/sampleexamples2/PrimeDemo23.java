package sampleexamples2;

import java.util.Scanner;

public class PrimeDemo23 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a number to print prime numbers.");
	int num=in.nextInt();
	if(num!=0)
	{
		int count=0;
		for(int i=2;i<=num;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				count++;
				break;
			}
			if(count==0)
			{
				System.out.print(i);
			}
		}
		
	}
}
}
