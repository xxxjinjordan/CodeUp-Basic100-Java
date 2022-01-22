package src.com.probs;

import java.util.Scanner;

public class P1096 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[25][25];
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			map[x][y] = 1;
		}

		for (int y = 1; y <= 19; y++) {
			for (int x = 1; x <= 19; x++) {
				System.out.printf("%d ", map[y][x]);
			}
			System.out.println();
		}

	}
}
