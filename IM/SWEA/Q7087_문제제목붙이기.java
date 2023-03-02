import java.util.Scanner;

class Q7087_문제제목붙이기 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[26];
			
			for(int i = 0; i < N; i++) {
				int c = sc.next().charAt(0);
				arr[c-65]++;
			}
			
			int result = 26;
			for(int i = 0; i < 26; i++) {
				if (arr[i] == 0) {
					result = i;
					break;
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}
}