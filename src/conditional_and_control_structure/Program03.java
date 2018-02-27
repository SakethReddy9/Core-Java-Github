//3.Print the mathematical table of give number

package conditional_and_control_structure;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number to print it's multiplication table: ");
		Scanner scr = new Scanner(System.in);
		
		int num = scr.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			 System.out.println(num +" X "+ i +" = "+(num * i));
			
		}
	}

}
