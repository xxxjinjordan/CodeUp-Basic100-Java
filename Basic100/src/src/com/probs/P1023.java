package src.com.probs;

import java.util.Scanner;

public class P1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		String str = Double.toString(d);
		String[] strArr = str.split("\\.");
		System.out.printf("%s%n%s", strArr[0], strArr[1]);
		
//		Scanner sc = new Scanner(System.in);
//		double d = sc.nextDouble();
//		int integer = (int)d;
//		double decimal = d - integer;
//		System.out.printf("%d%n%f", integer, decimal);
		
	}

}
