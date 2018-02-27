//8.Print factorial of all the numbers between given range

package conditional_and_control_structure;

import java.util.Scanner;


public class Program08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter minimum range:");
		int min = sc.nextInt();
		System.out.println("Enter maximum range:");
		int max = sc.nextInt();
		System.out.println();
		if(min < max) {
			for(int i = min; i <= max; i++) {
			long fact = 1;
			int k = 1;
				while(k <= i) {
					fact = fact * k;
					k++;
				
				}
			
			System.out.println("factorial of "+ i + " = "+fact);
			}
		}
		
	}

}
