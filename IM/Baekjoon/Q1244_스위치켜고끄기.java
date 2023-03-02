import java.util.ArrayList;
import java.util.Scanner;

class Q1244_스위치켜고끄기 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		ArrayList<Integer> arraylist = new ArrayList<Integer>(N);

		for (int i = 1; i <= N; i++) {
			int element = sc.nextInt();
			arraylist.add(element);
		}

		int M = sc.nextInt();
		for (int i = 1; i <= M; i++) {
			int gender = sc.nextInt();
			int num = sc.nextInt();

			if (gender == 1) {
				int j = 1;
				while (true) {
					int index = num * j - 1;
					if (index > N - 1) {
						break;
					} else {
						if (arraylist.get(index) == 0) {
							arraylist.set(index, 1);
						} else {
							arraylist.set(index, 0);
						}
						j += 1;
					}
				}
			} else {
				int range = Math.min(num - 1, N - num);
				int index = num - 1;
				int k = 0;

				for (int j = 1; j <= range; j++) {
					if (arraylist.get(index - j) == arraylist.get(index + j)) {
						k = j;
					} else {
						break;
					}
				}

				for (int j = index - k; j <= index + k; j++) {
					if (arraylist.get(j) == 0) {
						arraylist.set(j, 1);
					} else {
						arraylist.set(j, 0);
					}
				}
			}
		}

		int i = 0;
		for (Integer item : arraylist) {
			System.out.print(item + " ");
			i++;
			if (i == 20) {
				System.out.println("");
				i = 0;
			}
		}
	}
}