import java.util.Scanner;

public class Q3985_롤케이크 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int eMax = 0;
		int eIdx = 1;
		int rMax = 0;
		int rIdx = 1;

		int L = sc.nextInt();
		int[] cake = new int[L + 1];

		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			int P = sc.nextInt();
			int K = sc.nextInt();
			int cnt = 0;

			if (eMax < K - P + 1) {
				eMax = K - P + 1;
				eIdx = i;
			}

			for (int j = P; j <= K; j++) {
				if (cake[j] == 0) {
					cake[j] = 1;
					cnt++;
				}
			}

			if (rMax < cnt) {
				rMax = cnt;
				rIdx = i;
			}
		}

		System.out.println(eIdx);
		System.out.println(rIdx);
	}
}