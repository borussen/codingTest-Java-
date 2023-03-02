import java.util.Scanner;

public class Q2999_비밀이메일 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int N = str.length();
		int R = 1;
		int C = N;

		for (int r = 1; r <= (int) Math.sqrt(N); r++)
			if (N % r == 0) {
				R = r;
				C = N / r;
			}

		char[][] matrix = new char[R][C];

		for (int c = 0; c < C; c++)
			for (int r = 0; r < R; r++)
				matrix[r][c] = str.charAt(R * c + r);

		String answer = "";

		for (int r = 0; r < R; r++)
			for (int c = 0; c < C; c++)
				answer += matrix[r][c];

		System.out.println(answer);
	}
}