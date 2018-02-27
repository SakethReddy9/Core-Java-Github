//3.Write a program to find whether a give string is palindrome or not

package string_operations;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String str = sc.next();
		String temp = "";
		
		for (int i = (str.length() - 1); i >= 0; i--) {
			
			temp += str.charAt(i);
		}
		
		//System.out.println(temp);
		if(temp.equals(str)) {
			System.out.println("it is a palindrome");
			System.out.println(temp);
		}
		else {
			System.out.println("it is not a palindrome");
			System.out.println(temp);
		}

	}

}
