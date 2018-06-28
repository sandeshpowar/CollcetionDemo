package sampleexamples2;

import java.util.Scanner;

public class PrimeDemo {
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=in.nextInt();
		
		if(num!=0)
		{
			for(int i=2;i<=num;i++)
			{
				int count=0;
				for(int j=2;j<=i/2;j++)
				{
					count++;
					
				}
				if(count==0)
				{
					System.out.println("prime numbers=="+i);
				}
			}
			
			
			
		}
		}
		
	}
	
	
	



