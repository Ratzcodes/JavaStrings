package StringsPrograms;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// enter the string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		// count words in the string
		/* The split() method of String class splits
		 * a string in several strings based on the
		 * delimiter passed as an argument to it
		 */
		String[] wordCount = str.split(" ");
		//System.out.println("Number of words in the string is: " + wordCount.length);
		
		
		String reversedString ="";
		for( int i=0; i < wordCount.length; i++) {
			String strWord = wordCount[i];
			
			String reverseWord = "";
			for( int j = strWord.length()-1; j >=0; j--) {
				/* The charAt() function returns the character
				 * at the given position in a string
				 */
				reverseWord = reverseWord + strWord.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		
		System.out.println("Reverse String is: " +reversedString);
	
	sc.close();
	}

}
