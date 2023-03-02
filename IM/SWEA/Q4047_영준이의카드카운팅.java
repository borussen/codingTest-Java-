import java.util.Scanner;

class Q4047_영준이의카드카운팅 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int[] arrS = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
			int[] arrD = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
			int[] arrH = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
			int[] arrC = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
			
			int result = 1;
			int num;
			String str = sc.next();

			while(str.length() > 0) {
				if(str.charAt(0) == 'S') {
					if(str.charAt(1) == '0')
						num = --arrS[str.charAt(2) - 48];
					else
						num = --arrS[(int)str.charAt(2) - 38];
				} else if(str.charAt(0) == 'D') {
					if(str.charAt(1) == '0')
						num = --arrD[str.charAt(2) - 48];
					else
						num = --arrD[str.charAt(2) - 38];
				} else if(str.charAt(0) == 'H') {
					if(str.charAt(1) == '0')
						num = --arrH[str.charAt(2) - 48];
					else
						num = --arrH[str.charAt(2) - 38];
				} else {
					if(str.charAt(1) == '0')
						num = --arrC[str.charAt(2) - 48];
					else
						num = --arrC[str.charAt(2) - 38];
				}
				
				if (num < 0) {
					result = -1;
					break;
				}
				
				str = str.substring(3);
			}
			
			if(result == -1) 
				System.out.println("#" + tc + " ERROR");
			else {
				int sumS = 0;
				int sumD = 0;
				int sumH = 0;
				int sumC = 0;
				
				for(int i = 0; i < 14; i++) {
					sumS += arrS[i];
					sumD += arrD[i];
					sumH += arrH[i];
					sumC += arrC[i];
				}
				
				System.out.println("#" + tc + " " + sumS + " " + sumD + " " + sumH + " " + sumC);
			}
		}
	}
}