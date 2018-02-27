//1.Read 'N' numbers and display the same

package arrays_single_dimension;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter how many number to be entered: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter the number: " +(i+1) );
			arr[i] = sc.nextInt();
 		}
		System.out.println("the numbers entered: ");
		System.out.print("[ ");
		for (int i : arr) {
			System.out.print(i );
			System.out.print(", ");
		}
		System.out.print("]");

	}

}
