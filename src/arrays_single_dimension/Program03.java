//3.Write a program to search whether given number
//is present by using linear search
package arrays_single_dimension;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i;
		System.out.println("enter how many number to be entered: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for (int j = 0; j < n; j++) {
			System.out.println("enter the number: " +(j+1) );
			arr[j] = sc.nextInt();
 		}
		System.out.println("Enter a number to be searched: ");
		int num = sc.nextInt();
		
		for (i = 0; i < arr.length; i++) {
			if(arr[i] == num ) {
				System.out.println("Number is found at: " +i +" position");
				break;
			}
		}
		if( i == n) {
			System.out.println("Number not found");
		}

	}

}
