package src.com.probs;

import java.util.Scanner;

public class P1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		char a = 'a';
		while(a <= c) {
			System.out.print(a++ + " ");
		}
		
	}
}