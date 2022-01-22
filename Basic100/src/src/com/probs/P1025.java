package src.com.probs;

import java.util.Scanner;

public class P1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int temp = inputNum;
		int mul = 1;
		int arr[] = new int[5];
		
		for(int i=4; i>=0; i--) {
			arr[i] = (temp % 10) * mul;
			temp /= 10;
			mul *= 10;
		}
		
		for(int num:arr) {
			System.out.printf("[%d]%n", num);
		}
	}

}
