package src.com.probs;

import java.util.Scanner;

class P1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		
		for(int i=0; i<inputStr.length(); i++) {
			System.out.printf("'%c'%n",inputStr.charAt(i));
		}
	}

}
