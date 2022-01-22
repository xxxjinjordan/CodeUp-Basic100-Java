package src.com.probs;

import java.util.Scanner;

public class P1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.printf("%o", Integer.valueOf(str, 16));
	}

}
