package src.com.probs;

import java.util.Scanner;

public class P1058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		// boolean 형식 답
		// System.out.println(((a|b) == 0));
		
		System.out.println((a == 0) && (b == 0) ? 1 : 0);
		
	}

}