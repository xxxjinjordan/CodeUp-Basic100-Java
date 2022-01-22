package src.com.probs;

import java.util.Scanner;

public class P1099 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[10][10];

		int px = 1;
		int py = 1;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		while (true) {
			if (map[py][px] == 0)
				map[py][px] = 9;

			if (map[py][px] == 2) {
				map[py][px] = 9;
				break;
			} // 먹이를 먹으면 종료
			if (map[py][px + 1] == 1 && map[py + 1][px] == 1)
				break; // 맨 오른쪽 구석이면 종료

			if (map[py][px + 1] == 1) { // 오른쪽이 벽이면 아래로 진행
				py += 1;
			} else if (map[py][px + 1] == 0 || map[py][px + 1] == 2) {
				px += 1;
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d ", map[i][j]);
			}
			System.out.println();
		}

	}
}
