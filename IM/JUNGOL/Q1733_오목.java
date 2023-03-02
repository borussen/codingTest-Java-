import java.util.Scanner;

public class Q1733_오목 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matrix = new int[19][19];

		int[] dr = { 1, 1, 0, -1 };
		int[] dc = { 0, 1, 1, 1 };

		int resX = 0;
		int resY = 0;
		int result = 0;

		for (int r = 0; r < 19; r++)
			for (int c = 0; c < 19; c++)
				matrix[r][c] = sc.nextInt();

		Outer: for (int c = 0; c < 19; c++)
			for (int r = 0; r < 19; r++)
				if (matrix[r][c] == 1) {
					for (int i = 0; i < 4; i++) {
						int row = r;
						int col = c;
						int cnt = 1;

						for (int j = 1; j <= 5; j++) {
							row += dr[i];
							col += dc[i];

							if (0 <= row && row < 19 && 0 <= col && col < 19) {
								if (matrix[row][col] == 1)
									cnt++;
								else {
									if (cnt == 5) {
										resX = r + 1;
										resY = c + 1;
										result = 1;
										break Outer;
									} else {
										cnt = 0;
										break;
									}
								}
							}
						}

						if (cnt == 5) {
							resX = r + 1;
							resY = c + 1;
							result = 1;
							break Outer;
						} else if (cnt > 5)
							matrix[row][col] = 0;
					}
				} else if (matrix[r][c] == 2) {
					for (int i = 0; i < 4; i++) {
						int row = r;
						int col = c;
						int cnt = 1;

						for (int j = 1; j <= 5; j++) {
							row += dr[i];
							col += dc[i];

							if (0 <= row && row < 19 && 0 <= col && col < 19) {
								if (matrix[row][col] == 2)
									cnt++;
								else {
									if (cnt == 5) {
										resX = r + 1;
										resY = c + 1;
										result = 2;
										break Outer;
									} else {
										cnt = 0;
										break;
									}
								}
							}
						}

						if (cnt == 5) {
							resX = r + 1;
							resY = c + 1;
							result = 2;
							break Outer;
						} else if (cnt > 5)
							matrix[row][col] = 0;
					}
				}
		
		System.out.println(result);
		if (result != 0)
			System.out.println(resX + " " + resY);
	}
}