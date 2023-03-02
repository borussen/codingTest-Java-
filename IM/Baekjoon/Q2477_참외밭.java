import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2477_참외밭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();

		List<Integer> length = new ArrayList<Integer>();

		for (int i = 0; i < 6; i++) {
			int dir = sc.nextInt();
			length.add(sc.nextInt());
		}

		int area = 0;
		int extraArea = 0;

		for (int i = 0; i < 5; i++) {
			int temp = length.get(i) * length.get(i + 1);
			
			if (area < temp)
				area = temp;
            
			extraArea += temp;
		}

		extraArea += length.get(5) * length.get(0);

		if (area < length.get(5) * length.get(0))
			area = length.get(5) * length.get(0);
		
		int realArea = extraArea - 2 * area;
		
		System.out.println(K * realArea);
	}
}