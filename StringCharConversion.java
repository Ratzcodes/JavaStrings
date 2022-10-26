package StringsPrograms;

public class StringCharConversion {

	public static void main(String[] args) {
		//charToString();
		StringTochar();

	}
	
	
	public static void charToString() {
		/*
		  char to String conversion.
			Method 1: Using toString() method
			Method 2: Using valueOf() method
		 */
		char ch = 'a';
		String str1 = Character.toString(ch);
		System.out.println("New string is: " +str1);
		
		String str2 = String.valueOf(ch);
		System.out.println("String is: " +str2);
	}
	
	public static void StringTochar() {
		String str = "Hello";
		for ( int i =0; i <str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("Character at index: " +i+ " is: "+ch);
		}
		
		
	}

}
