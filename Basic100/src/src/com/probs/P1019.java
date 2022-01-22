package src.com.probs;

import java.util.Scanner;

public class P1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		
		String[] strArr = inputStr.split("\\.");
//		System.out.println(strArr.length);
		int year = Integer.parseInt(strArr[0]);
		int month = Integer.parseInt(strArr[1]);
		int day = Integer.parseInt(strArr[2]);
		
		System.out.printf("%04d.%02d.%02d%n", year, month, day);
	}

}
