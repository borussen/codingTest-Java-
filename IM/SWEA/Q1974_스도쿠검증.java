import java.util.Scanner;

class Q1974_스도쿠검증 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		int[][] sudoku = new int[9][9];

		for (int test_case = 1; test_case <= T; test_case++) {
			int result = 1;

			for (int i = 0; i < 9; i++) {
				int[] checkRow = { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
				for (int j = 0; j < 9; j++) {
					int number = sc.nextInt();
					sudoku[i][j] = number;
					checkRow[number]--;

					if (checkRow[number] < 0) {
						result = 0;
					}
				}
			}

			for (int i = 0; i < 9; i++) {
				int[] checkColumn = { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
				for (int j = 0; j < 9; j++) {
					checkColumn[sudoku[j][i]]--;

					if (checkColumn[sudoku[j][i]] < 0) {
						result = 0;
					}
				}
			}

			for (int row = 0; row < 3; row++) {
				for (int col = 0; col < 3; col++) {
					int[] checkSquare = { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							checkSquare[sudoku[i + 3 * row][j + 3 * col]]--;

							if (checkSquare[sudoku[i + 3 * row][j + 3 * col]] < 0) {
								result = 0;
							}
						}
					}
				}
			}

			System.out.println("#" + test_case + " " + result);
		}
	}
}