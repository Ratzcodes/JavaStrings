package StringsPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be sorted in alphabetical order: ");
		String str = sc.nextLine();
		
		// convert string to character array
		char ch_arr[] = str.toCharArray();
		
		
		// compare and sort the characters
		char temp;
		for(int i =0; i <ch_arr.length; i++) {
			for ( int j = i+1; j <ch_arr.length; j++ ) {
				if(ch_arr[i] > ch_arr[j]) {
					temp = ch_arr[i];
					ch_arr[i] = ch_arr[j];
					ch_arr[j] = temp;
				}
			}
		}
		str = new String(ch_arr);
		System.out.println("Sorted String is: " + str);
		
		
		
		// using the sort() method
		
		String oldStr = "jackiestalks";
		char[] charArray =oldStr.toCharArray();
		Arrays.sort(charArray);
		String sortedStr = new String(charArray);
		System.out.println("Sorting " + oldStr + " using the sort method. The string is now : "+sortedStr);
		
		
	sc.close();	
	}

}
