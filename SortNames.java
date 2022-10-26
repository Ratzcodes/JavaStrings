package StringsPrograms;

import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		
		// Count of the names
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter the count of the names you want to sort: ");
		int count = sc.nextInt();
		
		// enter names in an array
		String names[] = new String[count]; 
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the names you want to sort: ");
		for( int i= 0; i<count; i++) {
			names[i]= sc1.nextLine();
		}
		
		
		// Sort the names by comparing
		String temp;
		for( int i=0; i <count; i++) {
			for ( int j= i+1; j <count; j++) {
				if(names[i].compareTo(names[j])>0) {
				temp = names[i];
				names[i]= names[j];
				names[j] = temp;
				}
			}
		}
		
		// Print the sorted names in the array
		System.out.println("Names sorted are as follows: ");
		for( String name : names) {
			System.out.print(name + ",  ");
		}
		
		
		

		sc.close();
		sc1.close();
	}

}
