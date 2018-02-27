//4.Print the mathematical tables from 1 to 10

package conditional_and_control_structure;

public class Program04 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("**Table for "+ i +" **\n");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+" X "+j +" = " +(i * j));
				
			}
			System.out.println();
		}

	}

}
