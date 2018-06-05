package gugudan;

import java.util.Scanner;

public class GugudanExercise {

	// For Statement
	public static void main(String[] args) {
		
		System.out.println("출력하고 싶은 단을 입력하세요:");
		
		Scanner sc = new Scanner(System.in);
		int inDan = sc.nextInt();
			
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			
			int result = inDan * i;
			System.out.println(inDan + " * " + i + " = " + result);
		}

	}
 }
