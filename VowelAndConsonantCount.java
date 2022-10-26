package StringsPrograms;

public class VowelAndConsonantCount {

	public static void main(String[] args) {


		String str = "BeginnersBook";
		
		int vCount= 0, cCount =0;
		
		str = str.toLowerCase(); 		// convert string to lower case
		
		for(int i =0; i <str.length(); i++) {
			
			char ch = str.charAt(i);
			if(ch == 'a'|| ch == 'e' || ch=='i' || ch == 'o' ||ch == 'u') {
				vCount++;
			}
			else if ( ch  >= 'a' && ch  <= 'z') {
				cCount++;
			}
		}
		System.out.println("Number of vowles in the string, " + str + " is " +vCount);
		System.out.println("Number of consonants in the string, " + str + " is " +cCount);
	}

}
