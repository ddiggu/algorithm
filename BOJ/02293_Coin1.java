import java.util.Scanner;

public class Coin1 {

	static int m[] = new int[10001];
	static int c[] = new int[100];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();

		m[0] = 1;

		for (int i = 0; i < n; i++) {
			c[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= k; j++) {
				int temp = j - c[i] >= 0 ? m[j - c[i]] : 0;
				m[j] = temp + m[j];
			}
		}

		System.out.println(m[k]);
	}
}
