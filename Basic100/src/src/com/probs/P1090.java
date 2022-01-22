package src.com.probs;

import java.util.Scanner;

public class P1090 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double r = sc.nextDouble();
		double n = sc.nextDouble();
		double q = Math.pow(r, n - 1);
		long ans = (long) (a * q);

		System.out.printf("%d", ans);
	}
}
