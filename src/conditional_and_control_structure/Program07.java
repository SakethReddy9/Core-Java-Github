//7.Print the factorial of given number

package conditional_and_control_structure;

import java.util.Scanner;

public class Program07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		/*
		int fact = 1;
		int i = 1;
		while(i <= num) {
			fact = fact * i;
			i++;
		}
		*/
		
		int fact = num; 
		int i = num - 1;
		while(i >= 1) {
			fact = fact * i;
			i--;
		}
		System.out.println("factorial of the given number is : " + fact);

	}

}
