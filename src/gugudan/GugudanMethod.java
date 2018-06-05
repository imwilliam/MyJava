package gugudan;

// Method 이용 전체 구구단 출력

public class GugudanMethod {
	
	public static void gugudan (int i) {
		
		//Array Definition - Containing Gugudan
		int[] guguAray = new int[9]; 
		
		for (int j = 0; j < guguAray.length; j++) {
			guguAray[j] = i * (j+1);
			System.out.println(i + " * " + (j+1) +" = " + guguAray[j]);
		}
		
	}
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {

			System.out.println(i + "단");
			gugudan(i);
			System.out.println();
		}
		 
	}

}
