package src.com.probs;

import java.util.Scanner;

public class P1071 {
	// we don't use 'goto' keyword in Java
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt();
			if (num == 0)
				break;
			System.out.println(Integer.toString(num));
		}

	}
}