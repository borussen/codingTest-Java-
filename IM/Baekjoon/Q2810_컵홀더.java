import java.util.Scanner;

public class Q2810_컵홀더 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String str = sc.next();
		
		int cnt = 0;
		while(str.indexOf("LL") != -1) {
			str = str.replaceFirst("LL", "");
			cnt++;
		}
		
		System.out.println(Math.min(N, N + 1 - cnt));
	}
}
