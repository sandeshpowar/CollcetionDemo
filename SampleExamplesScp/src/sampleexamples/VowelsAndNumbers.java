package sampleexamples;
/*
Find number of vowels and digits in a String using Java:*/
	import java.util.Scanner;
	public class VowelsAndNumbers{
	    @SuppressWarnings("resource")
		public static void main(String[] args) {
	        String inputStr;
	        int v = 0;
	        int n = 0;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your string : ");
	        inputStr = scanner.nextLine();
	        for (int i = 0; i < inputStr.length(); i++) {
	            Character c = inputStr.charAt(i);
	            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c ==
	                    'o' || c == 'u') {
	                v++;
	            } else if (Character.isDigit(c)) {
	                n++;
	            }
	        }
	        System.out.println("No of vowels "+v);
	        System.out.println("No of numbers "+n);
	    }
	}