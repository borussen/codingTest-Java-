import java.util.Scanner;

public class Q2567_색종이2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matrix = new int[100][100];
		int N = sc.nextInt();

		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		int len = 0;

		for (int i = 1; i <= N; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();

			for (int r = 0; r < 10; r++)
				for (int c = 0; c < 10; c++)
					matrix[X + r][Y + c] = 1;
		}

		for (int r = 0; r < 100; r++)
			for (int c = 0; c < 100; c++)
				if (matrix[r][c] == 1) {
					if (r == 0 || r == 99)
						len++;
					if (c == 0 || c == 99)
						len++;

					for (int i = 0; i < 4; i++) {
						int nr = r + dr[i];
						int nc = c + dc[i];

						if (0 <= nr && nr < 100 && 0 <= nc && nc < 100) {
							if (matrix[nr][nc] == 0)
								len++;
						}
					}
				}

		System.out.println(len);
	}
}