package src.com.probs;

import java.util.Scanner;

public class P1097 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[25][25];

		for (int y = 0; y < 19; y++) {
			for (int x = 0; x < 19; x++) {
				map[y][x] = sc.nextInt();
			}
		}

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int y = sc.nextInt();
			for (int b = 0; b < 19; b++) {
				if (map[y - 1][b] == 0)
					map[y - 1][b] = 1;
				else
					map[y - 1][b] = 0;
			}
			int x = sc.nextInt();
			for (int a = 0; a < 19; a++) {
				if (map[a][x - 1] == 0)
					map[a][x - 1] = 1;
				else
					map[a][x - 1] = 0;
			}
		}

		for (int y = 0; y < 19; y++) {
			for (int x = 0; x < 19; x++) {
				System.out.printf("%d ", map[y][x]);
			}
			System.out.println();
		}

	}
}
