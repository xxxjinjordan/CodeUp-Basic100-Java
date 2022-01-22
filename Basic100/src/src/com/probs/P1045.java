package src.com.probs;

import java.math.BigInteger;
import java.util.Scanner;

public class P1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		BigInteger b1 = new BigInteger(Long.toString(a));
		BigInteger b2 = new BigInteger(Long.toString(b));
		BigInteger b3 = b1.multiply(b2);

		System.out.println(a + b); // 합
		System.out.println(a - b > 0 ? a - b : b - a); // 차
		System.out.println(b3); // 곱
		System.out.println(a / b); // 몫
		System.out.println(a % b); // 나머지
		System.out.printf("%.2f", (double)a / (double)b); // 나눈 값

	}

}
