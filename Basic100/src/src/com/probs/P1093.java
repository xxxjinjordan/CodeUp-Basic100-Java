package src.com.probs;

import java.util.Scanner;

public class P1093 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[24];
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int call = sc.nextInt();
			student[call]++;
		}

		for (int i = 1; i < student.length; i++) {
			System.out.printf("%d ", student[i]);
		}

	}
}
