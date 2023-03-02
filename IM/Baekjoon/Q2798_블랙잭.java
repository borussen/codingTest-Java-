import java.util.Scanner;

public class Q2798_블랙잭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] cardList = new int[N];
		for(int i = 0; i < N; i++)
			cardList[i] = sc.nextInt();
	
		int max = 0;
		for(int i = 0; i < N; i++)
			for(int j = i + 1; j < N; j++) 
				for(int k = j + 1; k < N; k++)
					if(cardList[i] + cardList[j] + cardList[k] <= M)
						if(max < cardList[i] + cardList[j] + cardList[k])
							max = cardList[i] + cardList[j] + cardList[k];
		
		System.out.println(max);
	}
}