//2.Find biggest and smallest number between given 'N' Numbers

package arrays_single_dimension;
import java.util.ArrayList;
import java.util.Scanner;

public class Program02 {
	
	//method to get min value
	public static int getMin(int[] arr) {
		int min =  arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i]; 
			}
		}
		return min;
	}

	//method to get max value
	public static int getMax(int[] arr) {
		int max =  arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i]; 
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter how many number to be entered: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter the number: " +(i+1) );
			arr[i] = sc.nextInt();
 		}
	
		
		System.out.println("Minimum value in the array: " +getMin(arr));
		System.out.println("Maximum value in the array: " +getMax(arr));
	}

}
