package StringsPrograms;

public class SubsetOfString {

	public static void main(String[] args) {
		/* find the number of characters in the string - length of the string
		 * Create a string array to hold the subset of  the string. Size of the array - n(n+1)/2
		 * Inside nested for loop use substring() method to find all the possible subsets of the string
		 * Store them in the array created in the step 2
		 * loop and print all subset elements
		 */

		
		String str = "JOY";
		
		int n = str.length();  	// length of the string or number of characters in the string
		int temp = 0;
		
		// create subset array with size
		String subsetArray[] = new String[n*(n+1)/2];
		
		for( int i=0; i < n; i++) {
			for ( int j= i; j <n; j++) {
				subsetArray[temp] = str.substring(i, j+1);
				temp++;
			}
		}
		
		// print values stored in subset array
		System.out.println("All the possible substrings of the given string " +str+ " are: ");
		for(int i= 0; i <subsetArray.length; i++) {
			System.out.println(subsetArray[i]);
		}
		
	}

}
