package src.com.probs;

import java.util.Scanner;

public class P1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		double size = 1;
		for(int i=0; i<4; i++) {
			arr[i] = sc.nextInt();
			size *= (double)arr[i];
		}
		
		size /= 8; // bit to byte
		size /= 1024; // to Mega
		size /= 1024;
		System.out.printf("%.1f MB%n", size);
	}
}