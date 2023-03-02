import java.util.Scanner;
import java.util.Stack;

public class Q17413_단어뒤집기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int state = -1;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == ' ') {
				while (!stack.isEmpty())
					sb.append(stack.pop());
				sb.append(c);
			} else if (c == '<') {
				while (!stack.isEmpty())
					sb.append(stack.pop());
				sb.append(c);
				state = 1;
			} else if (c == '>') {
				sb.append(c);
				state = -1;
			} else {
				if (state == 1)
					sb.append(c);
				else
					stack.push(c);
			}
		}

		while (!stack.isEmpty())
			sb.append(stack.pop());

		System.out.println(sb.toString());
	}
}