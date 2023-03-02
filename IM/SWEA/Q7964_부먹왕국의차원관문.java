import java.util.Scanner;

class Q7964_부먹왕국의차원관문 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int D = sc.nextInt();

			int[] arr = new int[N];
			for (int i = 0; i < N; i++)
				arr[i] = sc.nextInt();

			int distance = 0;
			int num = 0;
			for (int i = 0; i < N; i++) {
				if (arr[i] == 0)
					distance++;
				else
					distance = 0;

				if (distance == D) {
					num++;
					distance = 0;
				}
			}

			System.out.println("#" + tc + " " + num);
		}
	}
}