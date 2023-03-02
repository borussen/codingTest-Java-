import java.util.Arrays;
import java.util.Scanner;

public class Q1205_조커 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] cardList = new int[N];
		
		int joker = 0;
		for (int i = 0; i < N; i++) {
			cardList[i] = sc.nextInt();
			if (cardList[i] == 0)
				joker++;
		}

		Arrays.sort(cardList);
		
		int idx = 0;
		int max = 0;

		while (idx <= N - 1) {
			int num = joker;
			
			if (cardList[idx] != 0) {
				int cnt = 1;
				for (int i = idx; i < N - 1; i++) {
					if (cardList[i + 1] == cardList[i])
						continue;
					else if (cardList[i + 1] == cardList[i] + 1)
						cnt++;
					else {
						if (cardList[i + 1] - cardList[i] - 1 <= num) {
							cnt += cardList[i + 1] - cardList[i];
							num -= cardList[i + 1] - cardList[i] - 1;
						} else {
							break;
						}
					}
				}
				
				cnt += num;
				max = Math.max(cnt, max);
			}
			
			max = Math.max(joker, max);
			idx++;
		}

		System.out.println(max);
	}
}