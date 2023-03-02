
import java.util.Scanner;

public class Q1592_영식이와친구들 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		
		int[] arr = new int[N + 1];
		int idx = 1;
		int count = 0;
		
		while(true) {
			if(arr[idx] % 2 == 0)
				idx = (idx - L + N) % N;
			else
				idx = (idx + L) % N;
			
			if(++arr[idx] == M)
				break;
			
			count++;
		}
		
		System.out.println(count);
	}
}