package StringsPrograms;

import java.util.Scanner;

public class CheckForPalindrome {

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String originalString = in.nextLine();
		
		String reverseString = "";
		
		int length = originalString.length();
		for ( int i=length-1; i >= 0; i--) {
			reverseString = reverseString + originalString.charAt(i);
		}System.out.println("Reverse string is: " +reverseString);
				
		if(originalString.equalsIgnoreCase(reverseString)) {
			System.out.println(originalString + " is a Palindrome.");
		}else {
			System.out.println(originalString + " is not a Palindrome.");
		}

		in.close();
	}

}
