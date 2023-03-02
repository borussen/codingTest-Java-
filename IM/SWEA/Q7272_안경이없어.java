import java.util.Scanner;

class Q7272_안경이없어 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			String str1 = sc.next();
			String str2 = sc.next();
			
			str1 = str1.replaceAll("[EFGHIJKLMNSTUVWXYZ]", "C");
			str1 = str1.replaceAll("[DOPQR]", "A");
			
			str2 = str2.replaceAll("[EFGHIJKLMNSTUVWXYZ]", "C");
			str2 = str2.replaceAll("[DOPQR]", "A");
			
			if(str1.equals(str2))
				System.out.println("#" + tc + " SAME");
			else
				System.out.println("#" + tc + " DIFF");
		}
	}
}