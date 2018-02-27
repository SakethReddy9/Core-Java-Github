//1.Write a program to compare two Strings

package string_operations;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st string:");
		String s1 = sc.next();
		System.out.println("Enter 2nd string:");
		String s2 = sc.next();
		
		if(s1.equals(s2)) {
			System.out.println("both Strings are equal");
		}
		else {
			System.out.println("they are not equal");
		}
		

	}

}
