import java.util.Scanner;

public class Q2563_색종이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix = new int[100][100];
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			for(int r = 0; r < 10; r++)
				for(int c = 0; c < 10; c++)
					matrix[X + r][Y + c] = 1;
		}
		
		int area = 0;
		
		for(int r = 0; r < 100; r++)
			for(int c = 0; c < 100; c++)
				if(matrix[r][c] == 1)
					area++;
		
		System.out.println(area);
	}
}