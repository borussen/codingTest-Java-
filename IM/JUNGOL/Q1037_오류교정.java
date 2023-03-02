import java.util.Scanner;

public class Q1037_오류교정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		String result = "OK";
		
		int rCount = 0;
		int cCount = 0;
		int rIdx = -1;
		int cIdx = -1;
		
		for(int r = 0; r < n; r++) {
			int rSum = 0;
			for(int c = 0; c < n; c++) {
				matrix[r][c] = sc.nextInt();
				rSum += matrix[r][c];
			}
			if (rSum % 2 != 0) {
				rCount++;
				if (rCount == 1) {
					result = "Corrupt";
					rIdx = r + 1;
				} else if (rCount > 1) {
					result = "Corrupt";
					break;
				}
			}
		}
		
		for(int c = 0; c < n; c++) {
			int cSum = 0;
			for(int r = 0; r < n; r++)
				cSum += matrix[r][c];
			if (cSum % 2 != 0) {
				cCount++;
				if (cCount == 1) {
					result = "Corrupt";
					cIdx = c + 1;
				} else if (cCount > 1) {
					result = "Corrupt";
					break;
				}
			}
		}
		
		if (rCount == 1 && cCount == 1)
			System.out.printf("Change bit (%d,%d)", rIdx, cIdx);
		else
			System.out.println(result);
	}
}