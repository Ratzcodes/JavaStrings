package StringsPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * 1. case insensitive - toLowerCase() method
		 * 2. compare lengths of strings - length() method
		 * 3. copy characters of strings into array - toCharArray() method
		 * 4. sort the arrays - Arrays.sort()
		 * 5. compare using if else
		 */

		// input the strings
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string.");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string.");
		String str2 = sc.nextLine();
		
		//Converting the strings to lower case to
	    //perform case insensitive comparison
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		
		//Comparing the length of the two strings if the lengths
	    //are not equal then strings cannot be anagrams
		if ( str1.length() != str2.length()) {
			System.out.println("Strings are not Anagaram.");
		}
		else {
			
			//copying the characters of each strings in two different array
			char[] arrayStr1 = str1.toCharArray();
			char[] arraystr2 = str2.toCharArray();
			
			//Sorting both the arrays using Arrays.sort()
			Arrays.sort(arrayStr1);
			Arrays.sort(arraystr2);
			
			//Comparing the sorted arrays, if equal anagram else not anagram
			if(Arrays.equals(arrayStr1, arraystr2)== true){
				System.out.println(str1 + " and " + str2 + " are anagrams.");
			}else {
				System.out.println(str1 + " and " + str2 + " are not anagrams.");
			}	
		}
		
		
		sc.close();
	}

}
