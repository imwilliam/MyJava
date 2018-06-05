package gugudan;

import java.util.Scanner;

public class GugudanArray {
	
	public static void main(String[] args) {
		
		//Array Definition - Containing Gugudan
		int[] guguAray = new int[9]; 
		
		//Variable Member
		int x = 1;
		
		//Input the No. of Gugudan
		Scanner sc = new Scanner(System.in);
		int inDan = sc.nextInt();
		
		//Input validation
		if (inDan < 1 || inDan > 9 ) {
			System.out.println("입력한 구구단을 확인하세요!");
		}else {
			//Print Gugudan
			for (int i = 0; i < 9; i++) {
				guguAray[i] = inDan * x;
				System.out.println(inDan + " * " + x +" = " + guguAray[i]);
				x++;
			}
		}		
	}
}
