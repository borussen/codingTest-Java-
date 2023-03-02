import java.util.Scanner;

class Q1220_Magnetic {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int n = sc.nextInt();
			int[][] matrix = new int[n][n];
			int cnt = 0;

			for (int r = 0; r < 100; r++)
				for (int c = 0; c < 100; c++)
					matrix[r][c] = sc.nextInt();

			for (int c = 0; c < 100; c++) {
				String str = "";

				for (int r = 0; r < 100; r++) {
					if (matrix[r][c] == 1)
						str += 1;
					else if (matrix[r][c] == 2)
						str += 2;
				}

				for (int i = 0; i < str.length() - 1; i++)
					if (str.charAt(i) == '1' && str.charAt(i + 1) == '2')
						cnt++;
			}

			System.out.println("#" + tc + " " + cnt);
		}
	}
}