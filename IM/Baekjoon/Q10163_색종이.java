import java.util.Scanner;

public class Q10163_색종이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] matrix = new int[1001][1001];

		for (int i = 1; i <= N; i++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			int width = sc.nextInt();
			int height = sc.nextInt();

			for (int r = 0; r < width; r++)
				for (int c = 0; c < height; c++)
					matrix[row + r][col + c] = i;
		}

		int[] area = new int[N + 1];
		
		for (int r = 0; r < 1001; r++)
			for (int c = 0; c < 1001; c++)
				area[matrix[r][c]]++;

		for (int i = 1; i <= N; i++)
			System.out.println(area[i]);
	}
}