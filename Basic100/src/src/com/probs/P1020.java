package src.com.probs;

import java.util.Scanner;

public class P1020 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		
		String[] strArr = inputStr.split("-");
		int frontNum = Integer.parseInt(strArr[0]);
		int rearNum = Integer.parseInt(strArr[1]);
		
		System.out.printf("%06d%07d%n", frontNum, rearNum);
		*/
		
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		inputStr = inputStr.replace("-", "");
		System.out.printf("%013d", Long.parseLong(inputStr));
	}

}
