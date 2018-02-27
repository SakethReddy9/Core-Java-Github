//2.Write a program to print the give string in reverse order

package string_operations;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		for (int i = (str.length() - 1); i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
