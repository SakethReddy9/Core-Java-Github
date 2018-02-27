//6.Write a program to find number of occurrence of each character in given string

package string_operations;

import java.util.HashMap;
import java.util.Scanner;

public class Program06 {
	
							/*public static int count(String s, char c) {
								int res = 0;
								for (int i = 0; i < s.length(); i++) {
									if(s.charAt(i) == c)
										res++;
								}
								return res;
								
							}*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		HashMap<Character, Integer> map = new HashMap();
		
		int val;
		for (int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				val = map.get(str.charAt(i));
				val++;
				map.put(str.charAt(i), val);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for (Character  c: map.keySet()) {
			System.out.println("character: " + c + "   Count: "+ map.get(c));
			
			
		}
		//System.out.println(map);

	}

}
