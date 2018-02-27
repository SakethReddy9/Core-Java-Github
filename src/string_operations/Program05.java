//5.Write a program to display first character of each word in capital letter of given String

package string_operations;

import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		String words[] = str.split("\\s");
		String res = "";
		for (int i = 0; i < words.length; i++) {
													/*String word = words[i];
													word = word.replaceAll("( )+", " ").trim();
													words[i] = word;
													*/
			
			String cap = words[i].substring(0, 1);
			String small = words[i].substring(1);
			
			res += cap.toUpperCase() + small + " ";
		}
		res = res.trim();
		System.out.println(res);
	}

}
