//5.Find whether given number is prime number or not.

package conditional_and_control_structure;

import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {
	
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		int temp;
		boolean isPrime = true;
		
		int num = sc.nextInt();
		for(int i = 2; i < num/2; i++) {
			temp = num % i;
			if(temp == 0) { 
			
				isPrime = false;
			}		
		}
		if(isPrime) {
		System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
	}

}
