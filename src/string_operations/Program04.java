//4.Write a program to find number of words in given string

package string_operations;

import java.util.Scanner;

public class Program04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str = sc.nextLine();
		
		System.out.println("Number of words : " +words(str));
		
	}
	public static int words(String s) {
		int count = 0;
		
		for (int i = 0; i <s.length(); i++) {
			if( ((i > 0) &&(s.charAt(i) != ' ') && (s.charAt(i-1) == ' ')) 
					|| (s.charAt(0) != ' ') && (i == 0)) {
				count++;
			}
			
		}
		return count;
		
	}

}
