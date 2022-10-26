package StringsPrograms;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string with spaces: ");
		String str1 = sc.nextLine();
		
		String str2 = str1.replaceAll("\\s","");
		System.out.println("String after removing the spaces is: ");
		System.out.println(str2);

		sc.close();
	}

}
