package src.com.probs;

import java.util.Scanner;

public class P1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] call = new int[10005];
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			call[i] = sc.nextInt();

		}

		for (int i = n - 1; i >= 0; i--) {
			System.out.printf("%d ", call[i]);
		}

	}
}
