import java.util.Scanner;

public class Q8958_OX퀴즈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			int[] scoreList = new int[str.length()];
			int score = 0;
			int total = 0;
			
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if(c == 'O') 
					scoreList[i] = ++score;
				else {
					scoreList[i] = 0;
					score = 0;
				}
			}
			
			for(int i = 0; i < str.length(); i++)
				total += scoreList[i];
			
			System.out.println(total);
		}
	}
}