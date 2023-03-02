import java.util.Scanner;

class Q4789_성공적인공연기획 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();

			int[] arr = new int[str.length()];
			int[] arr2 = new int[str.length()];
			int num = 0;

			for (int i = 0; i < str.length(); i++)
				arr[i] = str.charAt(i) - 48;

			for (int i = 1; i < str.length(); i++)
				for (int j = 0; j < i; j++)
					arr2[i] += arr[j];

			for (int i = 0; i < str.length(); i++) {
				if (arr[i] > 0 && arr2[i] < i) {
					int extra = i - arr2[i];
					num += extra;

					for (int j = i; j < str.length(); j++)
						arr2[j] += extra;
				}
			}

			System.out.println("#" + tc + " " + num);
		}
	}
}