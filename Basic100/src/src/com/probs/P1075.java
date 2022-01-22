package src.com.probs;

import java.util.Scanner;

public class P1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		while(true) {
			System.out.println(--inputNum);
			if(inputNum == 0) break;
		}
	}
}