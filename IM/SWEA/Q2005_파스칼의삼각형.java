import java.util.Scanner;

class Q2005_파스칼의삼각형 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int testcase = 1; testcase <= T; testcase++) {
			int[][] pascal = new int[10][10];
			int N = sc.nextInt();
			
			for(int i = 0; i < N; i++) {
				pascal[0][i] = 1;
				
				if(i > 1) {
					for(int j = 1; j < i; j++) {
						pascal[j][i] = pascal[j-1][i-1] + pascal[j][i-1];
					}
				}
				
				pascal[i][i] = 1;
			}
			
			System.out.println("#" + testcase);
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print(pascal[j][i] + " ");
				}
				System.out.println();
			}
		}
	}
}