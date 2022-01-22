package src.com.probs;

import java.util.Scanner;

public class P1040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long inputNum[] = new long[2];
		for(int i=0; i<inputNum.length; i++) {
			inputNum[i] = sc.nextLong();
		}
		System.out.printf("%d", inputNum[0] + inputNum[1]);
	}

}
