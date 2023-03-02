import java.util.Scanner;

public class Q2839_설탕배달 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int result = 1;
		int cnt = 0;
		
		while(N % 5 != 0) {
			N -= 3;
			cnt++;
			
			if (N < 0) {
				result = -1;
				N = 0;
			}
		}

		if (result == -1)
			System.out.println(result);
		else
			System.out.println(cnt + N / 5);
	}
}