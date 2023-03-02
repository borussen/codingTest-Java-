import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10158_개미 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());

		int t = Integer.parseInt(br.readLine());

		p += t % (2 * w);
		if (p > w)
			p = Math.abs(2 * w - p);

		q += t % (2 * h);
		if (q > h)
			q = Math.abs(2 * h - q);

		System.out.println(p + " " + q);
	}
}
