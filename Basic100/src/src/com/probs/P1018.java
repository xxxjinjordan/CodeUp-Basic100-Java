package src.com.probs;

import java.util.Scanner;

public class P1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//System.out.println(str);
		String[] strArr = str.split(":");
		int hour = Integer.parseInt(strArr[0]);
		int min = Integer.parseInt(strArr[1]);
		
		System.out.printf("%d:%d%n", hour, min);
	}

}
