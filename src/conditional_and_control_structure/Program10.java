//11.Find whether the given number is Armstrong number or not.

package conditional_and_control_structure;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int temp = num;
		int r, sum = 0;
		while(num > 0) {
			r = num % 10;
			sum = sum + ((int)Math.pow(r, 3));
			num = num / 10;
		}
		if( temp == sum) {
			System.out.println(temp +" is a armstrong  number");
		}
		else {
			System.out.println(temp +" is not a armstrong  number");
		}
	}

}
