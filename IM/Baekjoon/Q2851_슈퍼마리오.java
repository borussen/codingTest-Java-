import java.util.Scanner;

public class Q2851_슈퍼마리오 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			num = sc.nextInt();
			sum += num;
			
			if(sum >= 100) break;
		}
		
		if((100 - (sum - num)) < (sum - 100))
			System.out.println(sum - num);
		else
			System.out.println(sum);	
	}
}