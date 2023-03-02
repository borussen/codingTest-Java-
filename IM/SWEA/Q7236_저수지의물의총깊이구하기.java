import java.util.Scanner;

class Q7236_저수지의물의총깊이구하기 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 };
		int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1};
		
		for (int tc = 1; tc <= T; tc++) {
			int max = 0;
			int N = sc.nextInt();
			char[][] matrix = new char[N][N];
			
			for (int r = 0; r < N; r++)
				for (int c = 0; c< N; c++)
					matrix[r][c] = sc.next().charAt(0);
			
			for (int r = 0; r < N; r++) {
				for (int c = 0; c< N; c++) {
					if(matrix[r][c] == 'W') {
						int depth = 0;
						
						for(int i = 0; i < 8; i++) {
							int nr = r + dr[i];
							int nc = c + dc[i];
							
							if(0 <= nr && nr <= N-1 && 0 <= nc && nc <= N-1)
								if(matrix[nr][nc] == 'W')
									depth += 1;
						}
						
						depth = Math.max(1, depth);
						
						if(max < depth)
							max = depth;
					}
				}
			}
			
			System.out.println("#" + tc + " " + max);
		}
	}
}