//4.Write a program to search whether given numbers
//is present or not using binary search
package arrays_single_dimension;

import java.util.*;
import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers to be entered: ");
		int num = sc.nextInt();
		ArrayList al = new ArrayList(num);
		for (int i = 0; i < num; i++) {
			System.out.println("enter the element : " + (i + 1));
			int n = sc.nextInt();
			al.add(n);
		}
		Collections.sort(al);
		int first = 0;
		int last = num - 1;
		int mid = (first + last)/2;
	}
}