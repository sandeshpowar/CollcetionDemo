/*package sampleexamples2;

import java.util.Scanner;

public class FactorialDemo {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter A number");
		int num=in.nextInt();
		
		if(num!=0)
		{
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				 fact=fact*i;
			}
			System.out.println("Factorial Of Given Number="+fact);
		}
		else {
		System.out.println("Please Enter valid number");
	 
		}
	}
		
	

}
*/


package sampleexamples2;

import java.util.Scanner;

public class FactorialDemo {
	
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=in.nextInt();
		
		if(num!=0)
		{
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial Of given Number is =="+fact);
			
		}else
		{
			System.out.println("Enetr a valid number");
		}
	}
	
}




