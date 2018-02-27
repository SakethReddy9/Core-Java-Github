//1.Find biggest/smallest number among 3 numbers

package conditional_and_control_structure;

import java.util.Scanner;


public class Program01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		System.out.println("Enter the third number");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("num1 = "+num1 + " is greater");
		} else if(num2 > num3) {
			System.out.println("num2 = "+num2 + " is greater");
		}
		else {
			System.out.println("num3 = "+num3 + " is greater");
		}
	}

}
