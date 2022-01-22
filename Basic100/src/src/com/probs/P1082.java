package src.com.probs;

import java.util.Scanner;

public class P1082 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int inputNum = Integer.valueOf(input, 16);
	
		for (int i = 1; i < 16; i++) {
			System.out.printf("%X*%X=%X%n", inputNum, i, inputNum * i);
		}
		sc.close();
	}
}