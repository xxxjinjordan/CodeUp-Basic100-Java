package src.com.probs;

import java.util.Scanner;

public class P1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		String[] strArr = inputStr.split("\\.");
		
		StringBuilder sb = new StringBuilder();
		sb.append(strArr[2]);
		sb.append('-');
		sb.append(strArr[1]);
		sb.append('-');
		sb.append(strArr[0]);
		
		System.out.println(sb.toString());
		
	}

}
