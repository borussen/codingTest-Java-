import java.util.Scanner;

public class Q2941_크로아티아알파벳 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		str = str.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "a");

		System.out.println(str.length());
	}
}