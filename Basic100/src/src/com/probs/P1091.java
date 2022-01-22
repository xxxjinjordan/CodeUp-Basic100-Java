package src.com.probs;

import java.util.Scanner;

public class P1091 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long m = sc.nextLong();
		long d = sc.nextLong();
		long n = sc.nextLong();

		for (int i = 0; i < n - 1; i++) {
			a *= m;
			a += d;
		}
		System.out.printf("%d", a);
	}
}
