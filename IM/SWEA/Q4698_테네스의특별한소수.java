import java.io.*;
import java.util.ArrayList;

public class Q4698_테네스의특별한소수 {

	public static ArrayList<Integer> getPrime(int num) {
		ArrayList<Integer> primeList = new ArrayList<>();

		for (int i = 2; i <= num; i++) {
			int isPrime = 1;
			for (int j = 2; j <= (int) Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = -1;
					break;
				}
			}
			if (isPrime == 1)
				primeList.add(i);
		}
		return primeList;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		ArrayList<Integer> primeList = getPrime(1000000);

		for (int tc = 1; tc <= T; tc++) {
			String[] str = br.readLine().split(" ");
			int A = Integer.parseInt(str[1]);
			int B = Integer.parseInt(str[2]);
			int cnt = 0;

			for (int l : primeList) {
				if (l < A)
					continue;
				if (l > B)
					break;
				if (Integer.toString(l).indexOf(str[0]) != -1)
					cnt++;
			}

			sb.append("#" + tc + " " + cnt + "\n");
		}
		System.out.println(sb);
	}
}