package src.com.probs;

import java.util.Scanner;

public class P1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long inputNum1 = sc.nextLong();
		long inputNum2 = sc.nextLong();
		long inputNum3 = sc.nextLong();
		long sum = inputNum1 + inputNum2 + inputNum3;
		double avg = (double)sum / 3;
		
		System.out.printf("%d%n%.1f",sum, avg);
		

	}

}
