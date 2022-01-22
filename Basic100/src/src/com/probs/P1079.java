package src.com.probs;

import java.util.Scanner;

public class P1079 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			char c = sc.next().charAt(0);
			System.out.println(c);
			if(c == 'q') break;
		}
	}
}