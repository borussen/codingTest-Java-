import java.util.Scanner;

public class Q2292_벌집 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int num = 6;
		int room = 1;
		
		while(N - 1 > 0) {
			N -= num;
			num += 6;
			room += 1;
		}
		
		System.out.println(room);
	}
}