package src.com.probs;

import java.util.Scanner;

public class P1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int sum = 0;
		int st = 1;
		while (true) {
			sum += st++;
			if (sum >= inputNum) {
				System.out.println(st - 1);
				break;
			}
		}
	}
}