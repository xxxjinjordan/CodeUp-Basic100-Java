package src.com.probs;

import java.util.Scanner;

public class P1098 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt(); // 세로
		int w = sc.nextInt(); // 가로

		int[][] map = new int[h + 1][w + 1];

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int[] input = new int[4];
			for (int j = 0; j < 4; j++) {
				input[j] = sc.nextInt();
			} // 입력처리
				// 0: 길이, 1: 방향, 2: y좌표, 3: x좌표

			for (int k = 0; k < input[0]; k++) {
				if (input[1] == 0) { // 가로
					map[input[2]][input[3] + k] = 1;
				} else {
					map[input[2] + k][input[3]] = 1;
				}
			}
		}

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				System.out.printf("%d ", map[i][j]);
			}
			System.out.println();
		}

	}
}
