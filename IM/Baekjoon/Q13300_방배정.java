import java.util.Scanner;

public class Q13300_방배정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] male = new int[7];
		int[] female = new int[7];
		
		for(int i = 1; i <= N; i++) {
			int S = sc.nextInt();
			int Y = sc.nextInt();
			
			if (S == 0)
				female[Y]++;
			else
				male[Y]++;
		}
		
		int num = 0;
		
		for(int i = 1; i <= 6; i++) {
			if(male[i] > 0) {
				if(male[i] % K == 0)
					num += male[i] / K;
				else
					num += male[i] / K + 1;
			}
			if(female[i] > 0)
				if(female[i] % K == 0)
					num += female[i] / K;
				else
					num += female[i] / K + 1;
		}
		
		System.out.println(num);
	}
}