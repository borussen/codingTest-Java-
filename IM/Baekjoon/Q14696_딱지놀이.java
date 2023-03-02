import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q14696_딱지놀이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			int a = sc.nextInt();
			Integer[] arrA = new Integer[a];
			
			for(int j = 0; j < a; j++)
				arrA[j] = sc.nextInt();
			
			Arrays.sort(arrA, Collections.reverseOrder());
			
			int b = sc.nextInt();
			Integer[] arrB = new Integer[b];
			
			for(int j = 0; j < b; j++)
				arrB[j] = sc.nextInt();
			
			Arrays.sort(arrB, Collections.reverseOrder());
			
			char result = 'D';
			
			for(int j = 0; j < Math.min(a, b); j++) {
				if (arrA[j] > arrB[j]) {
					result = 'A';
					break;
				}
				if (arrA[j] < arrB[j]) {
					result = 'B';
					break;
				}
			}
			
			if (result == 'D') {
				if (arrA.length > arrB.length)
					result = 'A';
				if (arrA.length < arrB.length)
					result = 'B';
			}
			
			System.out.println(result);
		}
	}
}