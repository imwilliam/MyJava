package gugudan;

// return 값 존재 method 정의, 파라미터 이용, 배열사용

public class GugudanMethod2 {
	
    // 몇단인지 입력 받아서 해당 구구단을 배열 guguAray에 저장 후 main으로 return
	public static int[] gugudan(int times) {
		int[] guguAray = new int[9];
		for (int j = 0; j < guguAray.length; j++) {
			guguAray[j] = times * (j+1);
		}		
		return guguAray;
	}
	
	// 몇단인지, 그에 해당하는 구구단배열값을 입력받아 해당 1개 단을 출력
	public static void guguPrint(int times, int guguAray[]) {
		for (int k = 0; k < guguAray.length; k++ ) {
			System.out.println(times + " * " + (k+1) +" = " + guguAray[k]);	
		}
	}
	
	// 2단부터 9단까지 구구단을 생성하는 메소드와 출력하는 메소드를 반복하여 호출
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			int guguAray[] = gugudan(i);
			guguPrint(i,guguAray);
			System.out.println();
		}
	}
}
