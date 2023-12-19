import java.util.Scanner;

import java.util.HashMap;

class NonRepeatingChar {

		static int nonRepeatingChar(String str) {
			
			for(int i = 0; i < str.length(); i++) {

				int count = 0;
				char ch = str.charAt(i);

				for(int j = i + 1; j < str.length(); j++) {
					
					if(str.charAt(j) == ch) {
						
						count++;
					}
				}

				if(count == 0) {

					return i;
				}
			}

			return -1;
		}	

		static int nonRepeatingCharWithWhile(String str) {

			HashMap<Character, Integer> charFrequency = new HashMap<>();

			for(int i = 0; i < str.length(); i++) {

				char ch = str.charAt(i);
				charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
			}

			System.out.println(charFrequency); 

			for(int i = 0; i < str.length(); i++) {

				if(charFrequency.get(str.charAt(i)) == 1) {

					return i;
				}
			}
			return -1;
		}

		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the string : ");
			String str = sc.nextLine();
			str = str.toLowerCase();
			System.out.println(str);
			int HashMapReturn = nonRepeatingCharWithWhile(str);
			System.out.println("The first non repeating character in the " + str + " is " + str.charAt(HashMapReturn));
		}
}
			