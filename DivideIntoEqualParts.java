package StringsPrograms;

public class DivideIntoEqualParts {

	public static void main(String[] args) {
		/*
		 * 1: enter the string
		 * 2. find the length of the string
		 * 3. Enter the number of equal parts to be divided into
		 * 4. divide length by number of parts, if remainder is not zero, it cannot be divided...else go ahead
		 * 5: Use substring method to divide into equal parts
		 * 6. Store it in a string array
		 * 7. Print the string array that contains the substrings
		 */

		String str = "Onetwotreforfivsix";
		int temp = 0;
		int len = str.length(); // length of the original string
		
		int n = 6;  	// divide into two equal parts
		
		int chars = len/n;  // number of characters in each string divided
		
		String[]  strParts = new String[n];		// array to store the broken string parts
		
		//Checking whether the string can be divided in equal parts or not
		if(len % n != 0) {
			System.out.println("String " + str +" cannot be divided into " + n+ " equal parts.");
		}
		else {
			// divide the string and store
			for (int i = 0; i < len; i = i+chars ) {
				String subStr = str.substring(i, i+chars);
				strParts[temp] = subStr;			// start storing parts from 0 index
				temp++;
			}
		}
		System.out.println(n + " equal parts ofthe given string are: ");
		for ( int i = 0; i  < strParts.length; i++) {
			System.out.println(strParts[i]);
		}
		
		
	}

}
