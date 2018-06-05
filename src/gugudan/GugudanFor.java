package gugudan;

// All Gugudan - Using Nested-For statement  

public class GugudanFor {
	
	public static void main(String[] args) {
		
		//Array Definition - Containing Gugudan
		int[] guguAray = new int[9]; 
		
		for (int i = 0; i < 9; i++) {
			
			System.out.println((i+1) + "단" );
			
			for (int j = 0; j < guguAray.length; j++) {
				guguAray[j] = (i+1) * (j+1);
				System.out.println((i+1) + " * " + (j+1) +" = " + guguAray[j]);
			}
			System.out.println();
		}
	}

}
