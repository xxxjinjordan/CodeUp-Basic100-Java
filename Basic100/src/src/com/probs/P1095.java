package src.com.probs;

import java.util.Scanner;

public class P1095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] call = new int[10005];
		int n = sc.nextInt();
		int min = 100000;

		for (int i = 0; i < n; i++) {
			call[i] = sc.nextInt();
			if (call[i] < min)
				min = call[i];
		}

		System.out.println(min);
	}
}
