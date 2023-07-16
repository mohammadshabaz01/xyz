package org.Cheating;

import java.util.Arrays;
import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		
		String string =sc.nextLine();
		long timeChecking =System.currentTimeMillis();
		String string2 =string.trim();//Trailing Whitespace.
		System.out.println(string2);
//		int index =string2.toUpperCase().indexOf("SHABAZ");
//		
//		System.out.println("the index position of Shabz is "+ index);
//		char[] chararr = string.toCharArray();
//		System.out.println(chararr);
//		System.out.println(chararr[4]);
//		System.out.println(Arrays.toString(chararr));
		
		//method to make any small letter to upper letter
//		String name1 ="Shabaz";
//		String name2 ="SHABAZ";
//		String name3 = "shabaz";
//		String name4 = "SHAbaz";
//		int a =10;
//		System.out.println(name1.toUpperCase());
//		System.out.println(name2.toUpperCase());
//		System.out.println(name3.toUpperCase());
//		System.out.println(name4.toUpperCase());
//		System.out.println(name1.toLowerCase());
//		System.out.println(name2.toLowerCase());
//		System.out.println(name3.toLowerCase());
//		System.out.println(name4 .toLowerCase());
//		System.out.println(a);
		
		
		// Making Substring of a given string
		int indexOfShabaz =string2.toUpperCase().indexOf("SHABAZ");
		System.out.println("Shabaz is at index of "+indexOfShabaz);
		String sub1 =string2.substring(indexOfShabaz +"SHABAZ".length(),32);
		System.out.println("The subString will be:"+sub1);
//		int m ="SHABAZ".length();
//		System.out.println(m);
		sc.close();
		long timeChecking2 =System.currentTimeMillis();
		long actual_time =timeChecking2-timeChecking;
		System.out.println(actual_time);
	}
}
//Hi This is Shabaz from this side
//SELECT first_name, last_name, email from customers