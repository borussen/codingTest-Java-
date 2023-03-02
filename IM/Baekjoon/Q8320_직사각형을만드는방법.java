import java.util.Scanner;

public class Q8320_직사각형을만드는방법 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;

		for (int i = 1; i <= N; i++)
			for (int j = 1; j <= (int) Math.sqrt(i); j++)
				if (i % j == 0)
					cnt++;

		System.out.println(cnt);
	}
}