import java.util.Scanner;

class Q1961_숫자배열회전 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int N = sc.nextInt();

			int[][] array = new int[N + 1][N + 1];

			for (int j = 1; j <= N; j++) {
				for (int k = 1; k <= N; k++) {
					array[j][k] = sc.nextInt();
				}
			}

			System.out.println("#" + i);

			for (int k = 1; k <= N; k++) {
				for (int m = 1; m <= N; m++) {
					System.out.print(array[N + 1 - m][k]);
				}
				System.out.print(" ");
				for (int m = 1; m <= N; m++) {
					System.out.print(array[N + 1 - k][N + 1 - m]);
				}
				System.out.print(" ");
				for (int m = 1; m <= N; m++) {
					System.out.print(array[m][N + 1 - k]);
				}
				System.out.println("");
			}
		}
	}
}