package src.com.probs;

import java.util.Scanner;

public class P1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a < 0) System.out.println("minus");
		else System.out.println("plus");
		if(a % 2 == 0) System.out.println("even");
		else System.out.println("odd");
	}

}