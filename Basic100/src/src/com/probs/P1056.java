package src.com.probs;

import java.util.Scanner;

public class P1056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		/*
		boolean bt = ((a^b) != 0);
		System.out.println(bt);
		--------
		!= 0 연산을 하게 되면 int to boolean 형 변환이 가능해진다.
		*/
		
		System.out.println(a == b ? 1 : 0);
	}

}