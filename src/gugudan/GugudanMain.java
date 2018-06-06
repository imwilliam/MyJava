package gugudan;

public class GugudanMain {
	
	// 2단부터 9단까지 구구단을 생성하는 메소드와 출력하는 메소드를 반복하여 호출
	public static void main(String[] args) {	
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			int guguAray[] = GugudanMethod2.gugudan(i);
			GugudanMethod2.guguPrint(i,guguAray);
			System.out.println();
		}
	}

}
