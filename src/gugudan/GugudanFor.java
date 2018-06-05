package gugudan;

// All Gugudan - Using Nested-For statement  

public class GugudanFor {
	
	public static void main(String[] args) {
		
		//Array Definition - Containing Gugudan
		int[] guguAray = new int[9]; 
		
		for (int i = 1; i < 10; i++) {
			
			System.out.println(i + "단" );
			
			for (int j = 0; j < guguAray.length; j++) {
				guguAray[j] = i * (j+1);
				System.out.println(i + " * " + (j+1) +" = " + guguAray[j]);
			}
			System.out.println();
		}
	}

}
