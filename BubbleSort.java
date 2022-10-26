package StringsPrograms;

// compare adjacent Strings, swap and sort in an ascending order - Bubble sort
public class BubbleSort {

	public static void main(String[] args) {
		String input[] = { "Ajeet", "Steve", "Rick", "Becky", "Mohan"};
		
		String temp;
		int len = input.length;
		
		// bubble sort
		System.out.println("Strings sorted is: ");
		for ( int i=0; i <len ; i++) {
			for ( int j= i+1; j < len; j++) {
				// comparing adjacent strings
				
				if( input[i].compareTo(input[j])> 0) {
				temp = input[i];
				input[i] = input [j];
				input[j] = temp;
				}
			}
			
			System.out.print(input[i] + ", ");
		}
		
	}

}
