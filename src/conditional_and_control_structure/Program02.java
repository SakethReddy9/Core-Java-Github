//2.Find biggest/smallest number among 'N' numbers

package conditional_and_control_structure;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		int num, small = 0, large = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter how many numbers should be entered:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
	
		for (int i = 0; i < n; i++) {
			System.out.println("enter number : "+(i+1));
			num = sc.nextInt();
			arr[i] = num;
		
			if(num > large) {
				large = num;
			}
			if(i == 1 && num > 0)
				small = num;
			if(num < small) {
				small = num;
			}
		}
		System.out.println("given numbers are : ");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("Largest  number is: "+large);
		System.out.println("smallest number is: "+small);
		
	}

}
