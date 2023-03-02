import java.util.Scanner;

class Q1940_가랏RC카 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int velocity = 0;
			int distance = 0;

			for (int i = 1; i <= N; i++) {
				int option = sc.nextInt();
				if (option == 1) {
					velocity += sc.nextInt();
				} else if (option == 2) {
					velocity -= sc.nextInt();
					velocity = Math.max(0, velocity);
				}
				distance += velocity;
			}
			System.out.println("#" + test_case + " " + distance);
		}
	}
}