package src.com.probs;

import java.util.Scanner;

public class P1088 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();

		for (int i = 1; i <= inputNum; i++) {
			if (i % 3 == 0)
				continue;
			System.out.printf("%d ", i);
		}
	}
}