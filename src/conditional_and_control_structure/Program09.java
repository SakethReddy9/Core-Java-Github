//10.Find whether the given number is pallindrome or not.

package conditional_and_control_structure;

import java.util.Scanner;

public class Program09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int temp = num;
		int s, res = 0;
		while(num > 0) {
			s = num % 10;
			res = ( res * 10) + s;
			num = num / 10;
		}
		if( temp == res) {
			System.out.println("It's a pallindrome");
		}
		else {
			System.out.println("It's not a pallindrome");
		}
	}

}
